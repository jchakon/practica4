package chacon.joan.practica4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if(id == R.id.hoteles_id){
            Intent i = new Intent(this, hoteles.class );
            startActivity(i);
        }else if(id == R.id.bares_id){
            Intent i = new Intent(this, bares.class );
            startActivity(i);
        }else if(id == R.id.turismo_id){
        Intent i = new Intent(this, turismo.class );
        startActivity(i);
        }else if(id == R.id.demografia_id){
            Intent i = new Intent(this, demografia.class );
            startActivity(i);
        }
        else if(id == R.id.about_id){
            Intent i = new Intent(this, about.class );
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
