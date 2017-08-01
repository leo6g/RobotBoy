package com.leo.test;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeQueryResponse;

public class MyTest {
	public static void main(String[] args) {
		String appId = "2017041406708810";
		String privateKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDBNZIhCqJOgnay3OkuE+6c0cyUnPRU3quitbV5Pi9cswyNfmqqUSBak2tgrOtWaZs+vwzrj+sStCB8LDn/hOSTDVC6fEPssPNfPHT5dPTpB7GdOWBLMgqKCaNT4H49iFhy0IDEXS0kLrC4pbBd/T3V0NmsjVvjbDqsrHjR/YgCxpgoFuUV5ynfNgKXZ6tDM5G2dHs5jcd2TXC/ucvyef8Tjt/ROAeSOxxAOtEIAB/P+USg8DUl2e8vVQMOJlJp4nPpeuTKH6FxsdIq75zjAh3TuIN+ZjF7IygZviJ8SFiC86CtZuNd1LTqi6tvreliQwl9Ho12J2HB3Eau8yewxZnpAgMBAAECggEBAJ/XvRRe4taG8sKZJsS7Mr5Eh7cvfqg0K9UJ9Z/fxXkwnCL3QjGzukuVCNHLXUt5RTmM/5hm0XkA0ptIT5dIj33lFzOhGOTZpA7XSoMSsoeTmOrVDAhJ1xRKUvhSkr4/bcVXICDUYUM86XFpilbH6v9YsK0jqbCl2oj+i1pXIM4BpOSsfjQPPEe/OWU9xlD3DAtDjJUNNDOzO3LGUZUohSlgFKXI81a4sW/Xg3Mw/HUmZz96Qy2Th6B9FU2LqiYBnZuxECnDplfERfJe/++3adlKhKLPg2aUeXEcAfqchWoJtRQ/3k3yOhIZfmCjxoqXjRcIyeYeGI5TzbyjsxZXu60CgYEA3p+Tb5FpShV2egTH0y9iKusLcJXm4D+bP0IM6zkL3GVNKCsIg1uI8QwkRYZPddtIdQcj32CBzikQK2lgZr2sboYWBqDDLQ1wL842hhn3wz8rk4XSye/+sxgABDJmg1r26BnMyG0Qest9a6PKoY4Y9SIh0SRI1hda1EM04kIn7WsCgYEA3i0QW04tWbzI93AxmNLPM4RAzNcZdQ4yaYRto83Zwge6z9t+iVQk9s4xDii/VeWMlvh2tLQ3N/Ked/ZbkD7O4TNVoJCCixFFgKgL/AsmiMq5bxuV8F/0YIHzXQCpfWEQ4bOr2KtKXg0T8PH55p+lSnxXVXcPsuolc37MKwwx9vsCgYAwRSVwsXTE7XZs6pBxR/rfF2u5k6clxGTjCG1Iq2vY89YQ+ZO096nvqhRLRt3/zfYd+dhbXM+IZfrtjsGqRUIYDNbFxSHMqPdERlAoL4U7Pn0yVXfo9TKinneScWMs5BJZLQ7r/knudiTRrAgJk4fxzt7KPDXWxeWZ1KCo1nNV1QKBgHRsHNQbpTwO5yhyTCsO3LDcLrCoTpi+NcCBOorJhcBdGJFvLWF9DFmgNqh6xbiXLxK1ZE7Q2NaidlPabqSppPLxWX9n+mAxTsBaTt1mYmzv/jewtuNdBMvFjOdBP4+J27TJ19UT/UZHiBmMUy18nrrnaURJvZo9hB5/ZTFxlIUdAoGBAJZilXtXZbR5amdbKGVZa5iN57D8nFRqMWbUzEnH9Z7K25wOhtYkGkIvKFUIniFZjkU5QrHSWil2nCLKiAVefXl/uBKGBNoiQ18EneiD1PWxukKHswNxKzBCD2U5mgsMy4JiUvZ5+NEPOMyOqR8RTLiynTggPORzI+CeuXKFhA3w";
		String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwTWSIQqiToJ2stzpLhPunNHMlJz0VN6rorW1eT4vXLMMjX5qqlEgWpNrYKzrVmmbPr8M64/rErQgfCw5/4Tkkw1QunxD7LDzXzx0+XT06QexnTlgSzIKigmjU+B+PYhYctCAxF0tJC6wuKWwXf091dDZrI1b42w6rKx40f2IAsaYKBblFecp3zYCl2erQzORtnR7OY3Hdk1wv7nL8nn/E47f0TgHkjscQDrRCAAfz/lEoPA1JdnvL1UDDiZSaeJz6Xrkyh+hcbHSKu+c4wId07iDfmYxeyMoGb4ifEhYgvOgrWbjXdS06ourb63pYkMJfR6NdidhwdxGrvMnsMWZ6QIDAQAB";
		
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",appId,privateKey,"json","UTF-8",publicKey,"RSA2");
		AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
		request.setBizContent("{" +
		"\"out_trade_no\":\"\"," +
		"\"trade_no\":\"20170728200040011100160069610629\"" +
		"  }");
		AlipayTradeQueryResponse response = null;
		try {
			response = alipayClient.execute(request);
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(response.isSuccess()){
		System.out.println("调用成功");
		} else {
		System.out.println("调用失败");
		}
	}
}
