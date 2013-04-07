package no.bekk.piworkshop

import com.pi4j.io.gpio.GpioFactory
import com.pi4j.io.gpio.PinState.{LOW => OFF}
import com.pi4j.io.gpio.PinState.{HIGH => ON}
import com.pi4j.io.gpio.RaspiPin
import com.pi4j.io.gpio.GpioPinDigitalOutput

object Gpio {
  
  private val gpio = GpioFactory.getInstance();
  
  lazy val leds = List(
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "gpio0", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "gpio1", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "gpio2", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, "gpio3", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "gpio4", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "gpio5", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, "gpio6", OFF),
      gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "gpio7", OFF)
  )
}

