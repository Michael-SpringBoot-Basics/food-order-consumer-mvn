/**
 * 
 */
package com.e4developer.foodorderconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * Bindable interface with one input channel.
 *
 * @see org.springframework.cloud.stream.annotation.EnableBinding
 * @author Michael Philomin Raj
 */
public interface FoodOrderSink {

	String INPUT = "input-food-order";

	@Input(FoodOrderSink.INPUT)
	SubscribableChannel input();

}