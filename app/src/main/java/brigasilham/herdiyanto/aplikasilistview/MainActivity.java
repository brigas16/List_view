package brigasilham.herdiyanto.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvItem;
    private String[] namanegara= new String[] {"Indonesia ", "Malaysia ", "Singapura " , "Italia " , "Inggris ","Belanda ","Argentina ","Chile ","Mesir ","Uganda "};
    private String[] ibukota= new String[]{"Jakarta ","Kuala Lumpur ", "Singapura " ,"Roma ", "London ", "Amsterdam ", "Buenos Aires ", "Santiago de Chile ", "Kairo ", "Kampala "};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("List View Sederhana");

        lvItem = (ListView)findViewById(R.id.list_view);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this, R.layout.negara_view,R.id.txtNegara ,namanegara);

        lvItem.setAdapter(adapter1);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){
                Toast.makeText( MainActivity.this,"Negara yang dipilih " + namanegara[position] +",Nama Ibukota "+ ibukota[position], Toast.LENGTH_LONG).show();

            }
        });
    }
}