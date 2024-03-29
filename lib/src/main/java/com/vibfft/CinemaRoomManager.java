package com.vibfft;

import java.util.Scanner;

public class CinemaRoomManager extends Exercise {

    ExType type;
    ExLevel level;

    int numOfRows;
    int numOfColumns;
    int[][] cinemaGrid = new int[numOfRows][numOfColumns];

    CinemaRoomManager() {
        type = ExType.SWITCH;
        level = ExLevel.EASY;
    }

    void displayCinemaGrid() {

        String seat = "S";
        for (int i = 0; i < this.numOfRows; i++) {
            for (int j = 0; j < this.numOfColumns; j++) {
                if (i == 0 && j == 0) {
                    System.out.print(" ");
                } else if (i == 0) {
                    System.out.printf(" %s",j);
                } else if (j == 0) {
                    System.out.print(i);
                } else {
                    System.out.printf(" %s",seat);
                }
            }
            System.out.println();
        }
    }

    private int ceilDiv(int rows, int divNumber) {
        return Math.floorDiv(rows, divNumber) + (rows % divNumber == 0 ? 0 : 1);
    }

    int calculateSeatCosts(int rows, int cols) {


        // first half rows of seats == 10 dollars
        // second half rows of seats == 8 dollars
        // when number of rows are odd, first half rows == Math.floorDiv(rows, 2)
        // second half rows == Math.Ceil
        int totalCost = 0;
        this.numOfRows = rows;
        this.numOfColumns = cols;
        int numSeats = rows * cols;

        if (numSeats <= 60) {
            return numSeats * 10;
        }

        if (rows % 2 == 1) {
            totalCost = Math.floorDiv(rows, 2) * cols * 10 + ceilDiv(rows, 2) * cols * 8;
        } else if (rows % 2 == 0) {
            totalCost = (rows / 2) * cols * 10 + (rows / 2) * cols * 8;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        CinemaRoomManager c = new CinemaRoomManager();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = s.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int cols = s.nextInt();

        System.out.println("Total income:");
        System.out.printf("$%s%n", c.calculateSeatCosts(rows, cols));
        System.out.println("Cinema:");
        c.displayCinemaGrid();

    }
}
