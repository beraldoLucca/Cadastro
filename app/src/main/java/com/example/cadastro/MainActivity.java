package com.example.cadastro;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding amb;
    private Formulario formulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());
        formulario = new Formulario();
        checkRadioButton();

        amb.salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = amb.nome.getText().toString();
                String phone = amb.phone.getText().toString();
                String email = amb.email.getText().toString();
                Boolean ingressedListOfEmail = amb.emailCheck.isChecked();
                String cidade = amb.cidade.getText().toString();

                formulario.setNome(name);
                formulario.setEmail(email);
                formulario.setCidade(cidade);
                formulario.setPhone(phone);
                formulario.setIngressaEmail(ingressedListOfEmail);
                Toast.makeText(getApplicationContext(), formulario.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        amb.limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amb.nome.setText("");
                amb.cidade.setText("");
                amb.email.setText("");
                amb.phone.setText("");
                amb.sexo.setText("");
                if(amb.emailCheck.isChecked()){
                    amb.emailCheck.setChecked(false);
                }
                amb.radioGroup.setActivated(false);
            }
        });
    }


    private void checkRadioButton() {
        amb.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if ((i == R.id.fem)) {
                    formulario.setGenero(amb.fem.getText().toString());
                } else {
                    formulario.setGenero(amb.masc.getText().toString());
                }
            }
        });
    }
}
