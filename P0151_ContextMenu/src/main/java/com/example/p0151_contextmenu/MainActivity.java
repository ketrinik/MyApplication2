package com.example.p0151_contextmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {

    TextView tvColor, tvSize;
    final int MENU_COLOR_RED = 1;
    final int MENU_COLOR_GREEN = 2;
    final int MENU_COLOR_BLUE = 3;

    final int MENU_SIZE_22 = 4;
    final int MENU_SIZE_26 = 5;
    final int MENU_SIZE_30 = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvColor = (TextView)findViewById(R.id.tvColor);
        tvSize = (TextView)findViewById(R.id.tvSize);

        registerForContextMenu(tvColor);
        registerForContextMenu(tvSize);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
        switch (view.getId()){
            case R.id.tvColor:
                menu.add(0, MENU_COLOR_RED, 0, "Red");
                menu.add(0, MENU_COLOR_GREEN, 0, "Green");
                menu.add(0, MENU_COLOR_BLUE, 0, "Blue");
                break;
            case R.id.tvSize:
                menu.add(0, MENU_SIZE_22, 0, "22");
                menu.add(0, MENU_SIZE_26, 0, "26");
                menu.add(0, MENU_SIZE_30, 0, "30");
                break;
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch(item.getItemId()){
            case MENU_COLOR_RED:
                tvColor.setTextColor(Color.RED);
                tvColor.setText("Text color = Red");
                break;
            case MENU_COLOR_GREEN:
                tvColor.setTextColor(Color.GREEN);
                tvColor.setText("Text color = Green");
                break;
            case MENU_COLOR_BLUE:
                tvColor.setTextColor(Color.BLUE);
                tvColor.setText("Text color = Blue");
                break;
            case MENU_SIZE_22:
                tvSize.setTextSize(22);
                tvSize.setText("Text size = 22");
                break;
            case MENU_SIZE_26:
                tvSize.setTextSize(26);
                tvSize.setText("Text size = 26");
                break;
            case MENU_SIZE_30:
                tvSize.setTextSize(30);
                tvSize.setText("Text size = 30");
                break;
        }
        return super.onContextItemSelected(item);
    }
}

//package com.example.p0151_contextmenu;
//
//        import android.graphics.Color;
//        import android.support.v7.app.AppCompatActivity;
//        import android.os.Bundle;
//        import android.view.ContextMenu;
//        import android.view.MenuItem;
//        import android.view.View;
//        import android.widget.TextView;
//
//        import java.security.acl.Group;
//
//public class MainActivity extends AppCompatActivity {
//
//    TextView tvColor, tvSize;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tvColor = (TextView)findViewById(R.id.tvColor);
//        tvSize = (TextView)findViewById(R.id.tvSize);
//
//        registerForContextMenu(tvColor);
//        registerForContextMenu(tvSize);
//    }
//
//    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
//        getMenuInflater().inflate(R.menu.context_menu,menu);
//        switch (view.getId()){
//            case R.id.tvColor:
//                menu.setGroupVisible(R.id.g1, true);
//                menu.setGroupVisible(R.id.g2, false);
//                break;
//            case R.id.tvSize:
//                menu.setGroupVisible(R.id.g2, true);
//                menu.setGroupVisible(R.id.g1, false);
//                break;
//
//        }
//
//    }
//    public boolean onContextItemSelected(MenuItem item){
//        switch(item.getItemId()){
//            case R.id.cRed:
//                tvColor.setTextColor(Color.RED);
//                tvColor.setText("Text color = Red");
//                break;
//            case R.id.cGreen:
//                tvColor.setTextColor(Color.GREEN);
//                tvColor.setText("Text color = Green");
//                break;
//            case R.id.cBlue:
//                tvColor.setTextColor(Color.BLUE);
//                tvColor.setText("Text color = Blue");
//                break;
//            case R.id.s22:
//                tvSize.setTextSize(22);
//                tvSize.setText("Text size = 22");
//                break;
//            case R.id.s26:
//                tvSize.setTextSize(26);
//                tvSize.setText("Text size = 26");
//                break;
//            case R.id.s30:
//                tvSize.setTextSize(30);
//                tvSize.setText("Text size = 30");
//                break;
//        }
//        return super.onContextItemSelected(item);
//    }
//}
