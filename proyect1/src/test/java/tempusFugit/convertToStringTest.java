package tempusFugit;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.code.tempusfugit.concurrency.ConcurrentRule;
import com.google.code.tempusfugit.concurrency.RepeatingRule;
import com.google.code.tempusfugit.concurrency.annotations.Concurrent;
import com.google.code.tempusfugit.concurrency.annotations.Repeating;

@Ignore
@RunWith(JUnitParamsRunner.class) 
public class convertToStringTest {

	@SuppressWarnings(value="all")
	private static final Object[] getTestValuesToConvert() {
		 return $(
		 $("5",5),
		 $("6",6),
		 $("44",44)
		 );
		}
	
	@Rule public ConcurrentRule concurrently = new ConcurrentRule();
	@Rule public RepeatingRule repeatedly = new RepeatingRule();
	
	
	@Test
	@Concurrent(count = 1000)
	@Repeating(repetition = 100)
	@Parameters(method = "getTestValuesToConvert") 
	public void testConvert(){
		
		
		ConvertToString convertToString = new ConvertToString();
		
		for (int i = 0; i < 100000; i++) {
			assertEquals(String.valueOf(i), convertToString.converToString(i));
		}
		
	}
}
