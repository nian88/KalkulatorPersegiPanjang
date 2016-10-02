package id.nian.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt_panjang, txt_lebar;
    TextView txt_hasil;
    String panjang, lebar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Kalkulator Luas Persegi Panjang");
        txt_panjang = (EditText) findViewById(R.id.txt_panjang);
        txt_lebar = (EditText) findViewById(R.id.txt_lebar);
        txt_hasil =(TextView)findViewById(R.id.lbl_hasil);
    }
    public void  hitung (View v){
        panjang = txt_panjang.getText().toString().trim();
        lebar = txt_lebar.getText().toString().trim();

        if(panjang.isEmpty()){
            Toast.makeText(this, "Masukkan Nilai Panjang", Toast.LENGTH_SHORT).show();
        }
        else if(lebar.isEmpty()){
            Toast.makeText(this, "Masukkan Nilai Lebar", Toast.LENGTH_SHORT).show();
        }else{
            double p = Double.parseDouble(panjang);
            double l = Double.parseDouble(lebar);
            double luas = p * l;
            txt_hasil.setText(getString(R.string.rumus) +"\n" +getString(R.string.luas)  +   luas);
        }
    }
}
