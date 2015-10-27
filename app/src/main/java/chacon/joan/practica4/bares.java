package chacon.joan.practica4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Chako on 05/10/2015.
 */
public class bares extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bares);
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
    public void opencaballo(View view){
        Intent i = new Intent(this, caballoloco.class );
        startActivity(i);
    }
    public void opencarnaval(View view){
        Intent i = new Intent(this, carnaval.class );
        startActivity(i);
    }
    public void openlavuelta(View view){
        Intent i = new Intent(this, lavuelta.class );
        startActivity(i);
    }
}
