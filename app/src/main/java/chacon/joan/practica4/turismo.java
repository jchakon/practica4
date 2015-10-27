package chacon.joan.practica4;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Chako on 05/10/2015.
 */
public class turismo extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turismo);
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
    public void openalpina(View view){
        Intent i = new Intent(this, laalpina.class );
        startActivity(i);
    }

    public void opencandilejas(View view){
        Intent i = new Intent(this, candilejas.class );
        startActivity(i);
    }
    public void openiglesia(View view){
        Intent i = new Intent(this, iglesia.class );
        startActivity(i);
    }
    public void opengrecia(View view){
        Intent i = new Intent(this, grecia.class );
        startActivity(i);
    }
    public void openpuente(View view){
        Intent i = new Intent(this, puente.class );
        startActivity(i);
    }
}
