package appewtc.masterung.ungrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private EditText userEditText;
    private EditText passwordEditText;
    private Button logginButton;
    private String userString,passwordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

    }   //Main Method

    private void buttonController() {
        logginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Receive Value From Edit Text
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

                //Check Space
                if (userString.equals("")  || passwordString.equals("")) {
                    //Have Space
                    MyAlertDialog myAlertDialog = new MyAlertDialog();
                    myAlertDialog.myDialog(MainActivity.this,
                            "มีช่องว่าง","กรุณากรอกทุกช่องคะ");
                } else {
                    //No Space

                }
            }//onClick
        });
    }   //buttonController

    private void bindWidget() {
        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText2);
        logginButton = (Button) findViewById(R.id.button);
    }

}   //main class