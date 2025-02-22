package cn.hutool.core.lang;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import cn.hutool.core.text.Simhash;
import cn.hutool.core.util.StrUtil;

public class SimhashTest {

	@Test
	public void simTest() {
		String text1 = "我是 一个 普通 字符串";
		String text2 = "我是 一个 普通 字符串";

		Simhash simhash = new Simhash();
		long hash = simhash.hash(StrUtil.split(text1, ' '));
		assertTrue(hash != 0);

		simhash.store(hash);
		boolean duplicate = simhash.equals(StrUtil.split(text2, ' '));
		assertTrue(duplicate);
	}
}
