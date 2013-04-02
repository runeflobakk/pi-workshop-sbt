package no.bekk.piworkshop

import com.pi4j.io.gpio.GpioFactory
import com.pi4j.io.gpio.RaspiPin
import com.pi4j.io.gpio.PinState.{LOW => OFF}
import com.pi4j.io.gpio.PinState.{HIGH => ON}
import com.pi4j.io.gpio.GpioController
import com.pi4j.io.gpio.GpioPinDigitalOutput
import Gpio.leds


object ScalaPi {

  def main(args: Array[String]) {
        
        leds foreach(_.on)
        
        println("So turned on!");
        Thread.sleep(2000);
        
        println("and off...");
        leds foreach(_.off)
  }
  
  implicit class Led(gpioController: GpioPinDigitalOutput) {
    def on = gpioController.setState(ON);
    def off = gpioController.setState(OFF);
  }
}