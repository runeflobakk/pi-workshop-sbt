package no.bekk.piworkshop

import com.pi4j.io.gpio.GpioFactory
import com.pi4j.io.gpio.RaspiPin
import com.pi4j.io.gpio.PinState.{LOW => OFF}
import com.pi4j.io.gpio.PinState.{HIGH => ON}
import com.pi4j.io.gpio.GpioController
import com.pi4j.io.gpio.GpioPinDigitalOutput

object ScalaPi {

  private val gpio = GpioFactory.getInstance();
  
  private val leds = List(
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "gpio0", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "gpio1", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "gpio2", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, "gpio3", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "gpio4", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "gpio5", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, "gpio6", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "gpio7", OFF)
  )
  
  implicit class Led(gpioController: GpioPinDigitalOutput) {
    def on = gpioController.setState(ON);
    def off = gpioController.setState(OFF);
  }
  
  def main(args: Array[String]) {
        
        leds foreach(_.on)
        
        println("So turned on!");
        Thread.sleep(2000);
        
        println("and off...");
        leds foreach(_.off)
  }
}