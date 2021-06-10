package sg.edu.rp.id20006707.demoarray;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    //String[] fruits;
    ArrayList<String> fruits;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textview);
//        fruits = new String[3];
//        fruits[0] = "apple";
//        fruits[1] = "banana";
//        fruits[2] = "cherry";

        fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add(1,"durian");
        fruits.remove(2);
        fruits.set(fruits.size()-1,"dragon fruit");

        String theFruits = fruits.get(1);



        String text = "Fruit\n====\n";

        for(int i = 0; i < fruits.size(); i ++) {
            text += fruits.get(i) + "\n";
        }
        tv.setText(text);
    }}
