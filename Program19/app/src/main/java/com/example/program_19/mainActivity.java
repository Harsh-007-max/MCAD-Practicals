package com.example.program_19;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class mainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.TV);
        registerForContextMenu(tv);
    }
    //Options Menu Code Starts Here
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem mi){
        switch(mi.getItemId()){
            case R.id.RedItem:
                Toast.makeText(this,"Red option was clicked",Toast.LENGTH_SHORT).show();
                getWindow().getDecorView().setBackgroundColor(Color.RED);
                return true;
            case R.id.GreenItem:
                Toast.makeText(this, "Green option was clicked", Toast.LENGTH_SHORT).show();
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                return true;
            case R.id.BlueItem:
                Toast.makeText(this, "Blue option was clicked", Toast.LENGTH_SHORT).show();
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                return true;
            case R.id.WhiteItem:
                Toast.makeText(this, "White option was clicked", Toast.LENGTH_SHORT).show();
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                return true;
            default:
                return super.onOptionsItemSelected(mi);
        }
    }
    //Options Menu Code Ends Here & Context Menu Code Starts Here.
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Select a color Theme");
        menu.add(0,v.getId(),0,"Cyan");
        menu.add(0,v.getId(),0,"Gray");
        menu.add(0,v.getId(),0,"Yellow");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch(item.getTitle().toString()){
            case "Cyan":
                getWindow().getDecorView().setBackgroundColor(Color.CYAN);
                Toast.makeText(this, "Background color changed to Cyan", Toast.LENGTH_SHORT).show();
                break;
            case "Gray":
                getWindow().getDecorView().setBackgroundColor(Color.GRAY);
                Toast.makeText(this, "Background color changed to Gray", Toast.LENGTH_SHORT).show();
                break;
            case "Yellow":
                getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                Toast.makeText(this, "Background color changed to Yellow", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
    //Context Menu Code ends here
}

