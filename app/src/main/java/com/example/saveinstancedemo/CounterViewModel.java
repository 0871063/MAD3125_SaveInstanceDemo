package com.example.saveinstancedemo;

import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

        int counter;

        public int getCounter() {
                return counter;
        }

        public void setCounter(int counter) {
                this.counter = counter;
        }
}
