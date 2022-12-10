package com.example.saveinstancedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.saveinstancedemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private CounterViewModel counterViewModel;
//    int counter;
//    private static String COUNTER = "COUNTER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        counterViewModel = new ViewModelProvider(this).get(CounterViewModel.class);
        binding.text.setText(String.valueOf(counterViewModel.getCounter()));

//        if(savedInstanceState != null){
//            counter = savedInstanceState.getInt(COUNTER);
//        }
        binding.addBtn.setOnClickListener( v -> incrementNumber());
    }

//    @Override
//    public void onSaveInstanceState(@NonNull Bundle outState) {
//        outState.putInt(COUNTER,counter);
//        super.onSaveInstanceState(outState);
//    }
//
//    @Override
//    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        binding.text.setText(counter);
//    }

    private void incrementNumber(){
        counterViewModel.setCounter(counterViewModel.getCounter() + 1);
        binding.text.setText(String.valueOf(counterViewModel.getCounter()));
//        binding.text.setText(String.valueOf(++counter));
    }
}