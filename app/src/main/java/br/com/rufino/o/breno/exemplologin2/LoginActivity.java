package br.com.rufino.o.breno.exemplologin2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin, buttonEsqueciSenha;
    private EditText usuario, senha;
    private TextView tentativas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = (EditText) findViewById(R.id.user);

        senha = (EditText) findViewById(R.id.password);

        btnLogin = (Button) findViewById(R.id.bntLogin);

        buttonEsqueciSenha = (Button) findViewById(R.id.buttonEsqueciSenha);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            //Essa interface define o método onClick(view), chamado quando o evento ocorre
            //Como View.OnClickListener é uma interface, o método onClick deve ser implementado
            @Override
            public void onClick(View view) {
                if (usuario.getText().toString().equals("impacta") &&
                        senha.getText().toString().equals("12345")) {
                    alerta("Login Efetuado...");
                    setContentView(R.layout.logado);
                } else {
                    alerta("Usuário ou senha incorreto");
                }
            }
        });

        buttonEsqueciSenha.setOnClickListener(new View.OnClickListener() {

            //Essa interface define o método onClick(view), chamado quando o evento ocorre
            //Como View.OnClickListener é uma interface, o método onClick deve ser implementado
            @Override
            public void onClick(View view) {
                alerta("Entre em contato com o suporte");
            }
        });
    }

    public void bntVoltar (View view){
        setContentView(R.layout.activity_login);

    }

    private void alerta(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
