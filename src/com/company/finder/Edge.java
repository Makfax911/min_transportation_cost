package com.company.finder;

public class Edge {
    public final String sourceCity, destinationCity;
    public final int cost;

    public Edge(String sourceCity, String destinationCity, int cost) {
        this.sourceCity = sourceCity;
        this.destinationCity = destinationCity;
        this.cost = cost;
    }
}
