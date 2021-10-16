package com.kickstart2021G.problem1;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.io.*;

public class SolutionTests {

	@Test
	public void contextLoads() {
		assert true;
	}

	@Test
	public void sampleTs1Input() throws Exception {
		String filename = "problem1/sample_ts1_input.txt";
		System.setIn(new ByteArrayInputStream(readFile(filename)));
		Solution.main(new String[]{});
	}

	@Test
	public void sampleTs2Input() throws Exception {
		String filename = "problem1/sample_ts2_input.txt";
		System.setIn(new ByteArrayInputStream(readFile(filename)));
		Solution.main(new String[]{});
	}

	@Test
	public void ts1Input() throws Exception {
		String filename = "problem1/ts1_input.txt";
		System.setIn(new ByteArrayInputStream(readFile(filename)));
		Solution.main(new String[]{});
	}

	@Test
	public void ts2Input() throws Exception {
		String filename = "problem1/ts2_input.txt";
		System.setIn(new ByteArrayInputStream(readFile(filename)));
		Solution.main(new String[]{});
	}

	@Test
	public void ts3Input() throws Exception {
		String filename = "problem1/ts3_input.txt";
		System.setIn(new ByteArrayInputStream(readFile(filename)));
		Solution.main(new String[]{});
	}

	private byte[] readFile(String inputFile) {
		URL resource = SolutionTests.class.getClassLoader().getResource(inputFile);
		try (InputStream inputStream = resource.openStream()) {
			return inputStreamToBytes(inputStream);
		} catch (IOException e) {
			throw new IllegalStateException("failed because of something");
		}
	}

	private byte[] inputStreamToBytes(InputStream inputStream) throws IOException {
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		int nRead;
		byte[] data = new byte[1024];
		while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
			buffer.write(data, 0, nRead);
		}

		buffer.flush();
		return buffer.toByteArray();
	}
}
