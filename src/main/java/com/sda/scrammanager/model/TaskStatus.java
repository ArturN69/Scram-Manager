package com.sda.scrammanager.model;

public enum TaskStatus {
    TO_DO, IN_PROGRESS, QUALITY_ASSURANCE, DONE;

    //wartość liczbowa statusów do obliczenia wykresu spalania - Integer z przedziału od 1 - 100
    // To do(0); In progress (0,4); QA (0,8); Done (1);
    //????Backlog (0)
}
