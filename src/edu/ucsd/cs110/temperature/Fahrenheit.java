package edu.ucsd.cs110.temperature;

/**
 * Created by Sbreining on 2/28/2017.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit( float t ){
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float val = ((this.getValue()-32)*5)/9;
        return new Celsius(val);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString(){
        return this.getValue()+" F";
    }
}
