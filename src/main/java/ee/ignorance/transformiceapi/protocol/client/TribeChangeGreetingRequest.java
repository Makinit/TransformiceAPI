package ee.ignorance.transformiceapi.protocol.client;

import ee.ignorance.transformiceapi.protocol.ByteBuffer;
import ee.ignorance.transformiceapi.titles.TribeRank;

public class TribeChangeGreetingRequest extends AbstractClientRequest {

	private String message;
	
	public TribeChangeGreetingRequest(String message) {
		this.message = message;
	}

	@Override
	public byte[] getBytes() {
		ByteBuffer bf = new ByteBuffer();
		bf.write(0x10);
		bf.write(0x14);
		bf.write(0x01);
		bf.print(message);
        return bf.getBytes();
	}

}
