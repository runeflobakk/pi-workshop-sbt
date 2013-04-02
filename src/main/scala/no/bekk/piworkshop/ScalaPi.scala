package no.bekk.piworkshop

import com.pi4j.io.gpio.GpioFactory
import com.pi4j.io.gpio.RaspiPin
import com.pi4j.io.gpio.PinState.{LOW => OFF}
import com.pi4j.io.gpio.PinState.{HIGH => ON}

object ScalaPi {

  private val gpio = GpioFactory.getInstance();
  private val led = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "gpio0");

  def main(args: Array[String]) {
        
        led.setState(ON)
        println("So turned on!");
        Thread.sleep(2000);
        
        println("and off...");
        led.setState(OFF)
  }
}