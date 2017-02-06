/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava; 
 */
package com.example.nsv_ajay.quantity;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nsv_ajay.quantity.*;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int n=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
      CheckBox checkbox=(CheckBox)findViewById(R.id.Box1);
        Boolean b=checkbox.isChecked();
        CheckBox checkbox2=(CheckBox)findViewById(R.id.Box2);
        Boolean b2=checkbox2.isChecked();
        EditText e1=(EditText)findViewById(R.id.editText);
        String res=e1.getText().toString();


        int t=n*5;
        String priceMessage=CreateOrderSummary(t,b,b2,res);
        displayMessage(priceMessage);
    }
    private void displayMessage(String message) {
       /** TextView priceTextView = (TextView) findViewById(R.id.def);
        priceTextView.setText(message);
    */
    TextView orderSummaryTextView=(TextView)findViewById(R.id.def);
        orderSummaryTextView.setText(message);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.abc);
        quantityTextView.setText("" + number);

    }
    public void increment(View view){
         n=n+1;
        display(n); displayPrice(n*5);
    }
    public void decrement(View view){
        if(n>0)
        {
            n=n-1;
        }
        display(n);displayPrice(n*5);}
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.def);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }
    public String CreateOrderSummary(int n,boolean b,boolean b2,String res)
    {
        String priceMessage=res;
        priceMessage +="\n Added Whipped icecream?"+b;
        priceMessage +="\n Added Chocolate?"+b2;
        priceMessage +="\n Quantity"+n;
        priceMessage +="\n Thank you";
        return priceMessage;    }
}
