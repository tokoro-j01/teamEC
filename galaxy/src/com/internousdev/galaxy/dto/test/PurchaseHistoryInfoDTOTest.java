package com.internousdev.galaxy.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.galaxy.dto.PurchaseHistoryInfoDTO;

public class PurchaseHistoryInfoDTOTest {
	// test getId()
	// テストのメソッドであることを示しているもの
	@Test
	public void test_getId_max() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		// 期待値を作成
		int expected = 2147483647;
		dto.setId(expected);

		// テスト対象
		int actual = dto.getId();

		// 期待値とテスト対象で取得した値が一致するかを確認
		assertEquals(expected, actual);
	}

	@Test
	public void test_getId_min() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getId_0() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	// test setId()
	@Test
	public void test_setId_max() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		// 期待値を作成
		int expected = 2147483647;

		// テスト対象
		dto.setId(expected);
		int actual = dto.getId();

		// 期待値とテスト対象で設定した値が一致するかを確認
		assertEquals(expected, actual);
	}

	@Test
	public void test_setId_min() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setId_0() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	// test getUserId()
	@Test
	public void test_getUserId_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "てすと";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "テスト";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserId_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// test setUserId()
	@Test
	public void test_setUserId_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "てすと";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "テスト";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserId_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// test getProductId()
	@Test
	public void test_getProductId_max() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductId_min() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductId_0() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	// test setProductId()
	@Test
	public void test_setProductId_max() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductId_min() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductId_0() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	// test getProductName()
	@Test
	public void test_getProductName_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductName_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductName_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductName_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductName_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductName_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductName_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "てすと";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductName_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "テスト";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductName_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductName_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// test setProductName()
	@Test
	public void test_setProductName_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductName_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductName_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductName_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductName_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductName_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductName_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "てすと";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductName_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "テスト";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductName_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductName_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// test getProductNameKana()
	@Test
	public void test_getProductNameKana_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductNameKana_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductNameKana_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductNameKana_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductNameKana_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductNameKana_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductNameKana_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "てすと";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductNameKana_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "テスト";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductNameKana_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductNameKana_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}



	// test setProductNameKana()
	@Test
	public void test_setProductNameKana_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductNameKana_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductNameKana_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductNameKana_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductNameKana_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductNameKana_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductNameKana_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "てすと";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductNameKana_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "テスト";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductNameKana_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductNameKana_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// test getImageFilePath()
	@Test
	public void test_getImageFilePath_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFilePath_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFilePath_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFilePath_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFilePath_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFilePath_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFilePath_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "てすと";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFilePath_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "テスト";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFilePath_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFilePath_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	// test setImageFilePath()
	@Test
	public void test_setImageFilePath_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFilePath_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFilePath_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFilePath_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFilePath_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFilePath_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFilePath_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "てすと";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFilePath_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "テスト";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFilePath_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFilePath_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	// test getImageFileName()
	@Test
	public void test_getImageFileName_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFileName_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFileName_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFileName_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFileName_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFileName_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFileName_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "てすと";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFileName_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "テスト";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFileName_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_getImageFileName_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	// test setImageFileName()
	@Test
	public void test_setImageFileName_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFileName_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFileName_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFileName_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFileName_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFileName_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFileName_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "てすと";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFileName_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "テスト";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFileName_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void test_setImageFileName_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	// test getReleaseCompany()
	@Test
	public void test_getReleaseCompany_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = null;
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getReleaseCompany_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getReleaseCompany_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = " ";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getReleaseCompany_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "　";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getReleaseCompany_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "abc";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getReleaseCompany_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "123";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getReleaseCompany_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "てすと";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getReleaseCompany_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "テスト";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getReleaseCompany_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getReleaseCompany_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字 テスト　てすと123abc";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	// test setReleaseCompany()
	@Test
	public void test_setReleaseCompany_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = null;
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setReleaseCompany_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setReleaseCompany_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = " ";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setReleaseCompany_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "　";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setReleaseCompany_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "abc";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setReleaseCompany_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "123";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setReleaseCompany_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "てすと";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setReleaseCompany_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "テスト";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setReleaseCompany_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setReleaseCompany_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字 テスト　てすと123abc";
		dto.setReleaseCompany(expected);

		String actual = dto.getReleaseCompany();

		assertEquals(expected, actual);
	}

	// test getReleaseDate()
	@Test
	public void test_getReleaseDate_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		Date expected = null;
		dto.setReleaseDate(expected);

		Date actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getReleaseDate_date() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected;
		try {
			expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		} catch (ParseException e) {
			fail();
		}
	}

	// test setReleaseDate()
	@Test
	public void test_setReleaseDate_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		Date expected = null;
		dto.setReleaseDate(expected);

		Date actual = dto.getReleaseDate();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setReleaseDate_date() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected;
		try {
			expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		} catch (ParseException e) {
			fail();
		}
	}

	// test getPrice()
	@Test
	public void test_getPrice_max() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 2147483647;
		dto.setPrice(expected);

		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getPrice_min() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = -2147483648;
		dto.setPrice(expected);

		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getPrice_0() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 0;
		dto.setPrice(expected);

		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	// test setPrice()
	@Test
	public void test_setPrice_max() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 2147483647;
		dto.setPrice(expected);

		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setPrice_min() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = -2147483648;
		dto.setPrice(expected);

		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setPrice_0() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 0;
		dto.setPrice(expected);

		int actual = dto.getPrice();

		assertEquals(expected, actual);
	}

	// test getProductCount()
	@Test
	public void test_getProductCount_max() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 2147483647;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductCount_min() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = -2147483648;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getProductCount_0() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 0;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();

		assertEquals(expected, actual);
	}

	// test setProductCount()
	@Test
	public void test_setProductCount_max() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 2147483647;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductCount_min() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = -2147483648;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setProductCount_0() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 0;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();

		assertEquals(expected, actual);
	}

	// test getTotal()
	@Test
	public void test_getTotal_max() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 2147483647;
		dto.setTotal(expected);

		int actual = dto.getTotal();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getTotal_min() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = -2147483648;
		dto.setTotal(expected);

		int actual = dto.getTotal();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getTotal_0() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 0;
		dto.setTotal(expected);

		int actual = dto.getTotal();

		assertEquals(expected, actual);
	}

	// test setTotal()
	@Test
	public void test_setTotal_max() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 2147483647;
		dto.setTotal(expected);

		int actual = dto.getTotal();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setTotal_min() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = -2147483648;
		dto.setTotal(expected);

		int actual = dto.getTotal();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setTotal_0() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		int expected = 0;
		dto.setTotal(expected);

		int actual = dto.getTotal();

		assertEquals(expected, actual);
	}

	// test getFamilyName()
	@Test
	public void test_getFamilyName_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = null;
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = " ";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "　";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "abc";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "123";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "てすと";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "テスト";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFamilyName_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字 テスト　てすと123abc";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	// test setFamilyName()
	@Test
	public void test_setFamilyName_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = null;
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = " ";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "　";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "abc";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "123";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "てすと";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "テスト";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFamilyName_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字 テスト　てすと123abc";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();

		assertEquals(expected, actual);
	}

	// test getFirstName()
	@Test
	public void test_getFirstName_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = null;
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = " ";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "　";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "abc";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "123";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "てすと";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "テスト";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getFirstName_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字 テスト　てすと123abc";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	//test setFirstName()
	@Test
	public void test_setFirstName_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = null;
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = " ";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "　";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "abc";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "123";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "てすと";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "テスト";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setFirstName_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字 テスト　てすと123abc";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();

		assertEquals(expected, actual);
	}

	// test getUserAddress()
	@Test
	public void test_getUserAddress_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = null;
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = " ";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "　";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "abc";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "123";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "てすと";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "テスト";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_getUserAddress_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字 テスト　てすと123abc";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	// test setUserAddress()
	@Test
	public void test_setUserAddress_null() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = null;
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_emptyCharacter() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_space() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = " ";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_fullSpace() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "　";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_alphabeticCharacters() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "abc";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_halfWidthDigit() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "123";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_hiragana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "てすと";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_katakana() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "テスト";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_kanji() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void test_setUserAddress_all() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		String expected = "漢字 テスト　てすと123abc";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();

		assertEquals(expected, actual);
	}

}
