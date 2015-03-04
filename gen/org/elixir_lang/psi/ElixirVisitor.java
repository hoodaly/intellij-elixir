// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class ElixirVisitor extends PsiElementVisitor {

  public void visitAdjacentExpression(@NotNull ElixirAdjacentExpression o) {
    visitPsiElement(o);
  }

  public void visitAlias(@NotNull ElixirAlias o) {
    visitQuotable(o);
  }

  public void visitAtCharTokenOrNumberOperation(@NotNull ElixirAtCharTokenOrNumberOperation o) {
    visitPsiElement(o);
  }

  public void visitAtPrefixOperator(@NotNull ElixirAtPrefixOperator o) {
    visitPsiElement(o);
  }

  public void visitAtom(@NotNull ElixirAtom o) {
    visitQuotable(o);
  }

  public void visitAtomKeyword(@NotNull ElixirAtomKeyword o) {
    visitQuotable(o);
  }

  public void visitBinaryDigits(@NotNull ElixirBinaryDigits o) {
    visitDigits(o);
  }

  public void visitBinaryWholeNumber(@NotNull ElixirBinaryWholeNumber o) {
    visitNumber(o);
    // visitWholeNumber(o);
  }

  public void visitCaptureCharTokenOrNumberOperation(@NotNull ElixirCaptureCharTokenOrNumberOperation o) {
    visitPsiElement(o);
  }

  public void visitCapturePrefixOperator(@NotNull ElixirCapturePrefixOperator o) {
    visitPsiElement(o);
  }

  public void visitCharListHeredoc(@NotNull ElixirCharListHeredoc o) {
    visitHeredoc(o);
    // visitInterpolatedCharList(o);
    // visitInterpolatedCharListHeredocLined(o);
    // visitQuote(o);
  }

  public void visitCharListLine(@NotNull ElixirCharListLine o) {
    visitInterpolatedCharList(o);
    // visitQuotable(o);
  }

  public void visitDecimalDigits(@NotNull ElixirDecimalDigits o) {
    visitDigits(o);
  }

  public void visitDecimalFloat(@NotNull ElixirDecimalFloat o) {
    visitDecimalNumber(o);
  }

  public void visitDecimalNumber(@NotNull ElixirDecimalNumber o) {
    visitNumber(o);
  }

  public void visitDecimalWholeNumber(@NotNull ElixirDecimalWholeNumber o) {
    visitNumber(o);
    // visitWholeNumber(o);
  }

  public void visitEmptyParentheses(@NotNull ElixirEmptyParentheses o) {
    visitPsiElement(o);
  }

  public void visitEnclosedHexadecimalEscapeSequence(@NotNull ElixirEnclosedHexadecimalEscapeSequence o) {
    visitEscapedHexadecimalDigits(o);
  }

  public void visitEndOfExpression(@NotNull ElixirEndOfExpression o) {
    visitUnquoted(o);
  }

  public void visitEscapedCharacter(@NotNull ElixirEscapedCharacter o) {
    visitEscapeSequence(o);
  }

  public void visitEscapedEOL(@NotNull ElixirEscapedEOL o) {
    visitPsiElement(o);
  }

  public void visitHatInfixOperator(@NotNull ElixirHatInfixOperator o) {
    visitPsiElement(o);
  }

  public void visitHeredocLinePrefix(@NotNull ElixirHeredocLinePrefix o) {
    visitPsiElement(o);
  }

  public void visitHeredocPrefix(@NotNull ElixirHeredocPrefix o) {
    visitPsiElement(o);
  }

  public void visitHexadecimalDigits(@NotNull ElixirHexadecimalDigits o) {
    visitDigits(o);
  }

  public void visitHexadecimalEscapeSequence(@NotNull ElixirHexadecimalEscapeSequence o) {
    visitPsiElement(o);
  }

  public void visitHexadecimalWholeNumber(@NotNull ElixirHexadecimalWholeNumber o) {
    visitNumber(o);
    // visitWholeNumber(o);
  }

  public void visitInfixDotOperator(@NotNull ElixirInfixDotOperator o) {
    visitPsiElement(o);
  }

  public void visitInterpolatedCharListBody(@NotNull ElixirInterpolatedCharListBody o) {
    visitBody(o);
  }

  public void visitInterpolatedCharListHeredocLine(@NotNull ElixirInterpolatedCharListHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitInterpolatedCharListSigilHeredoc(@NotNull ElixirInterpolatedCharListSigilHeredoc o) {
    visitCharListFragmented(o);
    // visitInterpolatedCharListHeredocLined(o);
    // visitSigilHeredoc(o);
  }

  public void visitInterpolatedCharListSigilLine(@NotNull ElixirInterpolatedCharListSigilLine o) {
    visitCharListFragmented(o);
    // visitSigilLine(o);
  }

  public void visitInterpolatedRegexBody(@NotNull ElixirInterpolatedRegexBody o) {
    visitBody(o);
  }

  public void visitInterpolatedRegexHeredoc(@NotNull ElixirInterpolatedRegexHeredoc o) {
    visitRegexFragmented(o);
    // visitSigilHeredoc(o);
  }

  public void visitInterpolatedRegexHeredocLine(@NotNull ElixirInterpolatedRegexHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitInterpolatedRegexLine(@NotNull ElixirInterpolatedRegexLine o) {
    visitRegexFragmented(o);
    // visitSigilLine(o);
  }

  public void visitInterpolatedSigilBody(@NotNull ElixirInterpolatedSigilBody o) {
    visitBody(o);
  }

  public void visitInterpolatedSigilHeredoc(@NotNull ElixirInterpolatedSigilHeredoc o) {
    visitSigilFragmented(o);
    // visitSigilHeredoc(o);
  }

  public void visitInterpolatedSigilHeredocLine(@NotNull ElixirInterpolatedSigilHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitInterpolatedSigilLine(@NotNull ElixirInterpolatedSigilLine o) {
    visitSigilFragmented(o);
    // visitSigilLine(o);
  }

  public void visitInterpolatedStringBody(@NotNull ElixirInterpolatedStringBody o) {
    visitBody(o);
  }

  public void visitInterpolatedStringHeredocLine(@NotNull ElixirInterpolatedStringHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitInterpolatedStringSigilHeredoc(@NotNull ElixirInterpolatedStringSigilHeredoc o) {
    visitStringFragmented(o);
    // visitInterpolatedStringHeredocLined(o);
    // visitSigilHeredoc(o);
  }

  public void visitInterpolatedStringSigilLine(@NotNull ElixirInterpolatedStringSigilLine o) {
    visitStringFragmented(o);
    // visitSigilLine(o);
  }

  public void visitInterpolatedWordsBody(@NotNull ElixirInterpolatedWordsBody o) {
    visitBody(o);
  }

  public void visitInterpolatedWordsHeredoc(@NotNull ElixirInterpolatedWordsHeredoc o) {
    visitWordsFragmented(o);
    // visitSigilHeredoc(o);
  }

  public void visitInterpolatedWordsHeredocLine(@NotNull ElixirInterpolatedWordsHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitInterpolatedWordsLine(@NotNull ElixirInterpolatedWordsLine o) {
    visitWordsFragmented(o);
    // visitSigilLine(o);
  }

  public void visitInterpolation(@NotNull ElixirInterpolation o) {
    visitQuotable(o);
  }

  public void visitKeywordKey(@NotNull ElixirKeywordKey o) {
    visitPsiElement(o);
  }

  public void visitKeywordPair(@NotNull ElixirKeywordPair o) {
    visitPsiElement(o);
  }

  public void visitKeywordValue(@NotNull ElixirKeywordValue o) {
    visitPsiElement(o);
  }

  public void visitList(@NotNull ElixirList o) {
    visitPsiElement(o);
  }

  public void visitLiteralCharListBody(@NotNull ElixirLiteralCharListBody o) {
    visitBody(o);
  }

  public void visitLiteralCharListHeredocLine(@NotNull ElixirLiteralCharListHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitLiteralCharListSigilHeredoc(@NotNull ElixirLiteralCharListSigilHeredoc o) {
    visitCharListFragmented(o);
    // visitSigilHeredoc(o);
  }

  public void visitLiteralCharListSigilLine(@NotNull ElixirLiteralCharListSigilLine o) {
    visitCharListFragmented(o);
    // visitSigilLine(o);
  }

  public void visitLiteralRegexBody(@NotNull ElixirLiteralRegexBody o) {
    visitBody(o);
  }

  public void visitLiteralRegexHeredoc(@NotNull ElixirLiteralRegexHeredoc o) {
    visitRegexFragmented(o);
    // visitSigilHeredoc(o);
  }

  public void visitLiteralRegexHeredocLine(@NotNull ElixirLiteralRegexHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitLiteralRegexLine(@NotNull ElixirLiteralRegexLine o) {
    visitRegexFragmented(o);
    // visitSigilLine(o);
  }

  public void visitLiteralSigilBody(@NotNull ElixirLiteralSigilBody o) {
    visitBody(o);
  }

  public void visitLiteralSigilHeredoc(@NotNull ElixirLiteralSigilHeredoc o) {
    visitSigilFragmented(o);
    // visitSigilHeredoc(o);
  }

  public void visitLiteralSigilHeredocLine(@NotNull ElixirLiteralSigilHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitLiteralSigilLine(@NotNull ElixirLiteralSigilLine o) {
    visitSigilFragmented(o);
    // visitSigilLine(o);
  }

  public void visitLiteralStringBody(@NotNull ElixirLiteralStringBody o) {
    visitBody(o);
  }

  public void visitLiteralStringHeredocLine(@NotNull ElixirLiteralStringHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitLiteralStringSigilHeredoc(@NotNull ElixirLiteralStringSigilHeredoc o) {
    visitStringFragmented(o);
    // visitSigilHeredoc(o);
  }

  public void visitLiteralStringSigilLine(@NotNull ElixirLiteralStringSigilLine o) {
    visitStringFragmented(o);
    // visitSigilLine(o);
  }

  public void visitLiteralWordsBody(@NotNull ElixirLiteralWordsBody o) {
    visitBody(o);
  }

  public void visitLiteralWordsHeredoc(@NotNull ElixirLiteralWordsHeredoc o) {
    visitWordsFragmented(o);
    // visitSigilHeredoc(o);
  }

  public void visitLiteralWordsHeredocLine(@NotNull ElixirLiteralWordsHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitLiteralWordsLine(@NotNull ElixirLiteralWordsLine o) {
    visitWordsFragmented(o);
    // visitSigilLine(o);
  }

  public void visitMatchedAtOperation(@NotNull ElixirMatchedAtOperation o) {
    visitPsiElement(o);
  }

  public void visitMatchedDotOperation(@NotNull ElixirMatchedDotOperation o) {
    visitPsiElement(o);
  }

  public void visitMatchedHatOperation(@NotNull ElixirMatchedHatOperation o) {
    visitPsiElement(o);
  }

  public void visitMatchedMultiplicationOperation(@NotNull ElixirMatchedMultiplicationOperation o) {
    visitPsiElement(o);
  }

  public void visitMatchedNonNumericCaptureOperation(@NotNull ElixirMatchedNonNumericCaptureOperation o) {
    visitPsiElement(o);
  }

  public void visitMatchedUnaryOperation(@NotNull ElixirMatchedUnaryOperation o) {
    visitPsiElement(o);
  }

  public void visitMultiplicationInfixOperator(@NotNull ElixirMultiplicationInfixOperator o) {
    visitPsiElement(o);
  }

  public void visitNoParenthesesKeywords(@NotNull ElixirNoParenthesesKeywords o) {
    visitPsiElement(o);
  }

  public void visitNoParenthesesKeywordsExpression(@NotNull ElixirNoParenthesesKeywordsExpression o) {
    visitPsiElement(o);
  }

  public void visitNoParenthesesManyArguments(@NotNull ElixirNoParenthesesManyArguments o) {
    visitPsiElement(o);
  }

  public void visitNoParenthesesManyArgumentsQualifiedCall(@NotNull ElixirNoParenthesesManyArgumentsQualifiedCall o) {
    visitPsiElement(o);
  }

  public void visitNoParenthesesManyArgumentsUnqualifiedCall(@NotNull ElixirNoParenthesesManyArgumentsUnqualifiedCall o) {
    visitPsiElement(o);
  }

  public void visitNoParenthesesManyStrictNoParenthesesExpression(@NotNull ElixirNoParenthesesManyStrictNoParenthesesExpression o) {
    visitPsiElement(o);
  }

  public void visitNoParenthesesNoArgumentsQualifiedCall(@NotNull ElixirNoParenthesesNoArgumentsQualifiedCall o) {
    visitPsiElement(o);
  }

  public void visitNoParenthesesNoArgumentsUnqualifiedCallOrVariable(@NotNull ElixirNoParenthesesNoArgumentsUnqualifiedCallOrVariable o) {
    visitPsiElement(o);
  }

  public void visitNoParenthesesStrict(@NotNull ElixirNoParenthesesStrict o) {
    visitPsiElement(o);
  }

  public void visitNumber(@NotNull ElixirNumber o) {
    visitPsiElement(o);
  }

  public void visitOctalDigits(@NotNull ElixirOctalDigits o) {
    visitDigits(o);
  }

  public void visitOctalWholeNumber(@NotNull ElixirOctalWholeNumber o) {
    visitNumber(o);
    // visitWholeNumber(o);
  }

  public void visitOpenHexadecimalEscapeSequence(@NotNull ElixirOpenHexadecimalEscapeSequence o) {
    visitEscapedHexadecimalDigits(o);
  }

  public void visitQualifiedAlias(@NotNull ElixirQualifiedAlias o) {
    visitPsiElement(o);
  }

  public void visitSigilModifiers(@NotNull ElixirSigilModifiers o) {
    visitQuotable(o);
  }

  public void visitStringHeredoc(@NotNull ElixirStringHeredoc o) {
    visitHeredoc(o);
    // visitInterpolatedString(o);
  }

  public void visitStringLine(@NotNull ElixirStringLine o) {
    visitInterpolatedString(o);
    // visitQuotable(o);
  }

  public void visitUnaryCharTokenOrNumberOperation(@NotNull ElixirUnaryCharTokenOrNumberOperation o) {
    visitPsiElement(o);
  }

  public void visitUnaryPrefixOperator(@NotNull ElixirUnaryPrefixOperator o) {
    visitPsiElement(o);
  }

  public void visitUnknownBaseWholeNumber(@NotNull ElixirUnknownBaseWholeNumber o) {
    visitNumber(o);
  }

  public void visitBody(@NotNull Body o) {
    visitElement(o);
  }

  public void visitCharListFragmented(@NotNull CharListFragmented o) {
    visitElement(o);
  }

  public void visitDigits(@NotNull Digits o) {
    visitElement(o);
  }

  public void visitEscapeSequence(@NotNull EscapeSequence o) {
    visitElement(o);
  }

  public void visitEscapedHexadecimalDigits(@NotNull EscapedHexadecimalDigits o) {
    visitElement(o);
  }

  public void visitHeredoc(@NotNull Heredoc o) {
    visitElement(o);
  }

  public void visitHeredocLine(@NotNull HeredocLine o) {
    visitElement(o);
  }

  public void visitInterpolatedCharList(@NotNull InterpolatedCharList o) {
    visitElement(o);
  }

  public void visitInterpolatedString(@NotNull InterpolatedString o) {
    visitElement(o);
  }

  public void visitQuotable(@NotNull Quotable o) {
    visitElement(o);
  }

  public void visitRegexFragmented(@NotNull RegexFragmented o) {
    visitElement(o);
  }

  public void visitSigilFragmented(@NotNull SigilFragmented o) {
    visitElement(o);
  }

  public void visitStringFragmented(@NotNull StringFragmented o) {
    visitElement(o);
  }

  public void visitUnquoted(@NotNull Unquoted o) {
    visitElement(o);
  }

  public void visitWordsFragmented(@NotNull WordsFragmented o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
