package chacon.joan.practica4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Chako on 04/10/2015.
 */
public class hoteles extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hoteles);
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
    public void openhpb(View view){
        Intent i = new Intent(this, hotelpb.class );
        startActivity(i);
    }
    public void openahm(View view){
        Intent i = new Intent(this, ahm.class );
        startActivity(i);
    }
    public void openlamansion(View view){
        Intent i = new Intent(this, lamansion.class );
        startActivity(i);
    }

}
