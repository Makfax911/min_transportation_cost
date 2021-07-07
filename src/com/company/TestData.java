package com.company;

import com.company.finder.Edge;
import com.company.finder.Graph;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    private List<Edge> graph;
    private static final String START = "Byd";
    private static final String END = "Warszawa";

    public TestData() {
        graph = new ArrayList<>();

        graph.add(new Edge("Gdansk", "Byd", 1));
        graph.add(new Edge("Gdansk", "Torun", 3));
        graph.add(new Edge("Byd", "Gdansk", 1));
        graph.add(new Edge("Byd", "Torun", 1));
        graph.add(new Edge("Byd", "Warszawa", 4));
        graph.add(new Edge("Torun", "Gdansk", 3));
        graph.add(new Edge("Torun", "Byd", 1));
        graph.add(new Edge("Torun", "Warszawa", 1));
        graph.add(new Edge("Warszawa", "Byd", 4));
        graph.add(new Edge("Warszawa", "Torun", 1));

        Graph g = new Graph(graph);
        g.shortestPath(START);
        g.printCost(END);
    }
}
