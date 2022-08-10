package fa.training.bfams.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import fa.training.bfams.model.DataRespone;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public DataRespone handleRuntimeException(RuntimeException e) {

		return new DataRespone(400, e.getMessage(), null);
	}
}
