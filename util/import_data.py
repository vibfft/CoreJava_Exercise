import sys, mysql.connector
from collections import namedtuple

# install the connector by running: python3 -m pip install mysql-connector-python
class Characters():

    sql_array = ["insert into characters (character_id, character_name, universe_id) values (%s, %s, %s)",
                 "insert into pets (character_id, pet_species) values (%s, %s)",
                 "insert into universe (universe_id, universe_name, author) values (%s, %s, %s)"]
    
    CHARACTERS_TABLE = "create table characters (" + \
                        "character_id int not null auto_increment," + \
                        "character_name varchar(30) not null," + \
                        "universe_id int not null," + \
                        "primary key (character_id));"
    
    PETS_TABLE = "create table pets (" + \
                        "character_id int," + \
                        "pet_species varchar(50) not null);"
    
    UNIVERSE_TABLE = "create table universe (" + \
                        "universe_id int not null auto_increment," + \
                        "universe_name varchar(30) not null," + \
                        "author varchar(30) not null," + \
                        "primary key (universe_id));"
    
    table_hash = {'characters.csv':CHARACTERS_TABLE, 'pets.csv':PETS_TABLE, 'universe.csv':UNIVERSE_TABLE}
    def __init__(self, host: str, user: str, password: str, database: str) -> None:
        self.host = host
        self.user = user
        self.password = password
        self.database = database
        
        self.db = mysql.connector.connect(
            host=self.host,
            user=self.user,
            password=self.password,
            database=self.database
        )

    def create_tables(self, file_name, c_cursor):
        try:
            c_cursor.execute(Characters.table_hash[file_name])
            self.db.commit()
        except mysql.connector.Error as err:
            if err.errno == mysql.connector.errorcode.ER_BAD_TABLE_ERROR:
                print("Error occurred during table creation")
            else:
                raise

    @staticmethod
    def read_csv_file(file_name: str, uniq_list: list) -> None:

        table = None
        f = None
        try: 
            f = open(file_name, "r")
            for i, each_line in enumerate(f.readlines()):

                array_list = each_line.strip().split(',')
                if i == 0: # it's a header
                    if len(array_list) == 3:
                        table = namedtuple("name_tuple", [array_list[0], array_list[1], array_list[2]]) # use file_name as a name for tuples
                    else:
                        table = namedtuple("name_tuple", [array_list[0], array_list[1]]) # use file_name as a name for tuples
                else:
                    if len(array_list) == 3:
                        uniq_list.append(table(array_list[0], array_list[1], array_list[2]))
                    else:
                        uniq_list.append(table(array_list[0], array_list[1]))


        except Exception as e:
            print(e)

        finally:
            # uniq_list = []
            f.close()

def main() -> None: 
    
    print("args: " + str(len(sys.argv)))
    if len(sys.argv) != 2:
        print(f"Usage: {sys.argv[0]} <password>")
        sys.exit(1)

    password = sys.argv[1]
    c = Characters("localhost","root",password.strip(),"characters")
    c_cursor = c.db.cursor()
    
    uniq_list = []
    for i, each_file in enumerate(["characters.csv", "pets.csv", "universe.csv"]):
        c.create_tables(each_file, c_cursor)
        c.read_csv_file(each_file, uniq_list)
        val = ""
        for j in range(len(uniq_list)):
            if each_file == "pets.csv":
                print(uniq_list[j][0],uniq_list[j][1])
                val = (uniq_list[j][0],uniq_list[j][1])
            else:
                print(uniq_list[j][0],uniq_list[j][1],uniq_list[j][2])
                val = (uniq_list[j][0],uniq_list[j][1],uniq_list[j][2])

            print()
            c_cursor.execute(Characters.sql_array[i], val)
        uniq_list = []  # cleared for the next set of inputs

    c.db.commit()
    c.db.close()

if __name__ == "__main__":
    main()
