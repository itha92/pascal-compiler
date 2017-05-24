/* The following code was generated by JFlex 1.6.1 */

package mini.pascal.compiler;

import java_cup.runtime.*;
import java.io.Reader;

import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/mini/pascal/compiler/lexer.flex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\15\1\56\1\60\1\60\1\57\22\0\1\15\1\0\1\16"+
    "\5\0\1\36\1\37\1\52\1\47\1\44\1\50\1\45\1\51\12\2"+
    "\1\43\1\42\1\54\1\46\1\55\2\0\1\10\1\24\1\34\1\31"+
    "\1\6\1\7\1\22\1\35\1\26\2\1\1\11\1\23\1\27\1\21"+
    "\1\20\1\1\1\4\1\13\1\3\1\5\1\33\1\30\1\1\1\32"+
    "\1\1\1\40\1\61\1\41\1\53\1\14\1\0\1\10\1\24\1\34"+
    "\1\31\1\6\1\7\1\22\1\35\1\26\2\1\1\11\1\23\1\27"+
    "\1\21\1\20\1\1\1\4\1\13\1\3\1\5\1\33\1\30\1\1"+
    "\1\32\1\1\1\17\1\0\1\62\7\0\1\60\252\0\2\25\115\0"+
    "\1\12\u1ea8\0\1\60\1\60\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\5\2\1\1\1\2\1\4"+
    "\1\5\1\6\4\2\1\1\6\2\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\4\1\27\1\30"+
    "\1\31\1\32\1\33\11\34\1\0\2\34\1\35\1\36"+
    "\3\34\1\37\1\0\1\37\4\34\1\40\1\0\3\34"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\3\34\1\0\1\34\1\51\2\34\1\52\1\0\2\34"+
    "\1\53\2\34\1\0\1\34\1\54\1\0\1\34\1\0"+
    "\1\34\2\55\1\56\1\34\1\57\1\60\1\34\2\61"+
    "\1\0\2\34\1\0\3\34\1\0\2\34\1\0\1\34"+
    "\1\0\1\34\1\0\1\34\1\62\1\34\2\63\1\64"+
    "\1\0\3\34\2\65\1\34\1\0\1\34\1\0\1\34"+
    "\2\66\1\67\2\70\3\34\1\0\1\34\1\0\1\34"+
    "\1\71\1\34\1\72\2\73\2\74\1\34\1\75";

  private static int [] zzUnpackAction() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\u0132\0\u0165"+
    "\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297\0\231\0\231"+
    "\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc\0\u042f"+
    "\0\u0462\0\u0495\0\u04c8\0\231\0\231\0\231\0\231\0\231"+
    "\0\u04fb\0\231\0\231\0\231\0\231\0\231\0\231\0\231"+
    "\0\231\0\u052e\0\u0561\0\231\0\231\0\231\0\u0594\0\231"+
    "\0\u05c7\0\314\0\u05fa\0\u062d\0\u0660\0\u0693\0\u06c6\0\u06f9"+
    "\0\u072c\0\u075f\0\u0792\0\u07c5\0\u07f8\0\314\0\314\0\u082b"+
    "\0\u085e\0\u0891\0\231\0\u08c4\0\314\0\u08f7\0\u092a\0\u095d"+
    "\0\u0990\0\314\0\u09c3\0\u09f6\0\u0a29\0\u0a5c\0\231\0\231"+
    "\0\231\0\231\0\231\0\231\0\231\0\231\0\u0a8f\0\u0ac2"+
    "\0\u0af5\0\u0b28\0\u0b5b\0\314\0\u0b8e\0\u0bc1\0\314\0\u0bf4"+
    "\0\u0c27\0\u0c5a\0\314\0\u0c8d\0\u0cc0\0\u0cf3\0\u0d26\0\314"+
    "\0\u0d59\0\u0d8c\0\u0dbf\0\u0df2\0\231\0\314\0\314\0\u0e25"+
    "\0\314\0\314\0\u0e58\0\231\0\314\0\u0e8b\0\u0ebe\0\u0ef1"+
    "\0\u0f24\0\u0f57\0\u0f8a\0\u0fbd\0\u0ff0\0\u1023\0\u1056\0\u1089"+
    "\0\u10bc\0\u10ef\0\u1122\0\u1155\0\u1188\0\314\0\u11bb\0\231"+
    "\0\314\0\314\0\u11ee\0\u1221\0\u1254\0\u1287\0\231\0\314"+
    "\0\u12ba\0\u12ed\0\u1320\0\u1353\0\u1386\0\231\0\314\0\314"+
    "\0\231\0\314\0\u13b9\0\u13ec\0\u141f\0\u1452\0\u1485\0\u14b8"+
    "\0\u14eb\0\314\0\u151e\0\314\0\231\0\314\0\231\0\314"+
    "\0\u1551\0\314";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\5\1\11\1\12"+
    "\1\13\1\5\1\14\1\15\1\4\1\16\1\17\1\20"+
    "\1\21\1\22\1\5\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\5\1\32\1\33\1\5\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\16\2\0"+
    "\2\4\17\54\1\55\42\54\1\56\16\57\1\60\37\57"+
    "\2\0\1\57\1\61\1\57\64\0\11\62\1\0\2\62"+
    "\3\0\5\62\1\0\10\62\27\0\1\6\61\0\3\62"+
    "\1\63\5\62\1\0\2\62\3\0\5\62\1\0\7\62"+
    "\1\64\26\0\5\62\1\65\3\62\1\0\2\62\3\0"+
    "\5\62\1\0\10\62\26\0\10\62\1\66\1\0\2\62"+
    "\3\0\5\62\1\0\1\62\1\67\6\62\26\0\7\62"+
    "\1\70\1\62\1\0\2\62\3\0\5\62\1\0\10\62"+
    "\26\0\3\62\1\71\5\62\1\0\2\62\3\0\5\62"+
    "\1\0\1\62\1\72\6\62\30\0\1\73\60\0\2\62"+
    "\1\74\6\62\1\0\2\62\3\0\5\62\1\0\10\62"+
    "\42\0\1\16\40\0\1\16\5\0\3\62\1\75\5\62"+
    "\1\0\2\62\3\0\5\62\1\0\10\62\26\0\3\62"+
    "\1\76\2\62\1\77\2\62\1\0\2\62\3\0\5\62"+
    "\1\0\10\62\26\0\11\62\1\0\2\62\3\0\1\62"+
    "\1\100\3\62\1\0\10\62\26\0\5\62\1\101\3\62"+
    "\1\0\2\62\3\0\1\62\1\102\3\62\1\0\10\62"+
    "\34\0\1\103\17\0\1\104\34\0\6\62\1\105\2\62"+
    "\1\0\2\62\3\0\5\62\1\0\1\62\1\106\6\62"+
    "\26\0\11\62\1\0\2\62\3\0\1\62\1\107\3\62"+
    "\1\0\10\62\26\0\3\62\1\110\5\62\1\0\2\62"+
    "\3\0\5\62\1\0\7\62\1\111\26\0\11\62\1\0"+
    "\2\62\3\0\1\62\1\112\3\62\1\113\1\114\7\62"+
    "\26\0\7\62\1\115\1\62\1\0\2\62\3\0\5\62"+
    "\1\0\10\62\26\0\11\62\1\0\2\62\3\0\5\62"+
    "\1\0\7\62\1\116\73\0\1\117\62\0\1\120\6\0"+
    "\1\121\53\0\1\122\14\0\16\57\1\0\37\57\2\0"+
    "\1\57\1\0\1\57\3\0\1\123\1\124\11\0\1\125"+
    "\10\0\1\126\34\0\4\62\1\127\4\62\1\0\2\62"+
    "\3\0\5\62\1\0\10\62\26\0\5\62\1\130\3\62"+
    "\1\0\2\62\3\0\5\62\1\0\10\62\26\0\7\62"+
    "\1\131\1\62\1\0\2\62\3\0\5\62\1\0\10\62"+
    "\26\0\11\62\1\132\1\133\1\62\3\0\5\62\1\0"+
    "\10\62\26\0\11\62\1\0\2\62\3\0\5\62\1\0"+
    "\3\62\1\134\4\62\26\0\10\62\1\135\1\0\2\62"+
    "\3\0\5\62\1\0\10\62\26\0\3\62\1\136\5\62"+
    "\1\0\2\62\3\0\5\62\1\0\10\62\26\0\11\62"+
    "\1\0\2\62\3\0\5\62\1\0\3\62\1\137\4\62"+
    "\31\0\1\140\57\0\3\62\1\141\5\62\1\0\2\62"+
    "\3\0\5\62\1\0\10\62\26\0\11\62\1\0\2\62"+
    "\3\0\1\62\1\142\3\62\1\0\10\62\26\0\11\62"+
    "\1\0\2\62\3\0\5\62\1\0\3\62\1\143\4\62"+
    "\26\0\11\62\1\0\2\62\3\0\2\62\1\144\2\62"+
    "\1\0\10\62\26\0\11\62\1\0\2\62\3\0\1\62"+
    "\1\145\3\62\1\0\10\62\30\0\1\146\60\0\2\62"+
    "\1\147\6\62\1\0\2\62\3\0\5\62\1\0\10\62"+
    "\26\0\2\62\1\150\6\62\1\0\2\62\3\0\5\62"+
    "\1\0\10\62\26\0\11\62\1\0\2\62\3\0\5\62"+
    "\1\151\1\152\7\62\26\0\11\62\1\0\2\62\3\0"+
    "\5\62\1\153\1\154\7\62\60\0\1\155\30\0\11\62"+
    "\1\0\2\62\3\0\5\62\1\0\5\62\1\156\2\62"+
    "\26\0\3\62\1\157\5\62\1\0\2\62\3\0\5\62"+
    "\1\0\10\62\26\0\7\62\1\160\1\62\1\0\2\62"+
    "\3\0\5\62\1\0\10\62\26\0\5\62\1\161\3\62"+
    "\1\0\2\62\3\0\5\62\1\0\10\62\26\0\11\62"+
    "\1\0\2\62\3\0\5\62\1\0\1\62\1\162\6\62"+
    "\26\0\11\62\1\0\2\62\3\0\5\62\1\0\3\62"+
    "\1\163\4\62\33\0\1\164\55\0\5\62\1\165\3\62"+
    "\1\0\2\62\3\0\5\62\1\0\10\62\26\0\11\62"+
    "\1\166\1\167\1\62\3\0\5\62\1\0\10\62\26\0"+
    "\7\62\1\170\1\62\1\0\2\62\3\0\5\62\1\0"+
    "\10\62\52\0\2\171\35\0\11\62\1\0\2\62\3\0"+
    "\5\62\1\171\1\172\7\62\26\0\11\62\1\0\2\62"+
    "\3\0\2\62\1\173\2\62\1\0\6\62\1\174\1\62"+
    "\26\0\11\62\1\0\2\62\3\0\5\62\1\175\1\176"+
    "\7\62\26\0\10\62\1\177\1\0\2\62\3\0\5\62"+
    "\1\0\10\62\33\0\1\200\55\0\5\62\1\201\3\62"+
    "\1\0\2\62\3\0\5\62\1\0\10\62\30\0\1\202"+
    "\60\0\2\62\1\203\6\62\1\0\2\62\3\0\5\62"+
    "\1\0\10\62\36\0\1\204\52\0\10\62\1\205\1\0"+
    "\2\62\3\0\5\62\1\0\10\62\26\0\3\62\1\206"+
    "\5\62\1\0\2\62\3\0\5\62\1\0\10\62\26\0"+
    "\10\62\1\207\1\0\2\62\3\0\5\62\1\0\10\62"+
    "\33\0\1\210\55\0\5\62\1\211\3\62\1\0\2\62"+
    "\3\0\5\62\1\0\10\62\26\0\11\62\1\0\2\62"+
    "\3\0\5\62\1\0\4\62\1\212\3\62\54\0\1\213"+
    "\34\0\11\62\1\0\2\62\3\0\5\62\1\0\1\62"+
    "\1\214\6\62\26\0\3\62\1\215\5\62\1\0\2\62"+
    "\3\0\5\62\1\0\10\62\26\0\5\62\1\216\3\62"+
    "\1\0\2\62\3\0\5\62\1\0\10\62\54\0\1\217"+
    "\34\0\11\62\1\0\2\62\3\0\5\62\1\0\1\62"+
    "\1\220\6\62\26\0\5\62\1\221\3\62\1\0\2\62"+
    "\3\0\5\62\1\0\10\62\47\0\1\222\41\0\11\62"+
    "\1\0\2\62\3\0\2\62\1\223\2\62\1\0\10\62"+
    "\33\0\1\224\55\0\5\62\1\225\3\62\1\0\2\62"+
    "\3\0\5\62\1\0\10\62\33\0\1\226\55\0\5\62"+
    "\1\227\3\62\1\0\2\62\3\0\5\62\1\0\10\62"+
    "\26\0\11\62\1\0\2\62\3\0\5\62\1\0\1\62"+
    "\1\230\6\62\47\0\1\231\41\0\11\62\1\0\2\62"+
    "\3\0\2\62\1\232\2\62\1\0\10\62\26\0\7\62"+
    "\1\233\1\62\1\0\2\62\3\0\5\62\1\0\10\62"+
    "\26\0\11\62\1\0\2\62\3\0\5\62\1\0\3\62"+
    "\1\234\4\62\26\0\7\62\1\235\1\62\1\0\2\62"+
    "\3\0\5\62\1\0\10\62\33\0\1\236\55\0\5\62"+
    "\1\237\3\62\1\0\2\62\3\0\5\62\1\0\10\62"+
    "\36\0\1\240\52\0\10\62\1\241\1\0\2\62\3\0"+
    "\5\62\1\0\10\62\26\0\11\62\1\0\2\62\3\0"+
    "\3\62\1\242\1\62\1\0\10\62\26\0\4\62\1\243"+
    "\4\62\1\0\2\62\3\0\5\62\1\0\10\62\26\0"+
    "\11\62\1\0\2\62\3\0\5\62\1\0\1\62\1\244"+
    "\6\62\31\0\1\245\57\0\3\62\1\246\5\62\1\0"+
    "\2\62\3\0\5\62\1\0\10\62\54\0\1\247\34\0"+
    "\11\62\1\0\2\62\3\0\5\62\1\0\1\62\1\250"+
    "\6\62\26\0\3\62\1\251\5\62\1\0\2\62\3\0"+
    "\5\62\1\0\10\62\26\0\5\62\1\252\3\62\1\0"+
    "\2\62\3\0\5\62\1\0\10\62\25\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5508];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\12\1\2\11\13\1\5\11\1\1\10\11"+
    "\2\1\3\11\1\1\1\11\12\1\1\0\7\1\1\11"+
    "\1\0\6\1\1\0\3\1\10\11\3\1\1\0\5\1"+
    "\1\0\5\1\1\0\2\1\1\0\1\1\1\0\1\1"+
    "\1\11\6\1\1\11\1\1\1\0\2\1\1\0\3\1"+
    "\1\0\2\1\1\0\1\1\1\0\1\1\1\0\3\1"+
    "\1\11\2\1\1\0\3\1\1\11\2\1\1\0\1\1"+
    "\1\0\1\1\1\11\2\1\1\11\4\1\1\0\1\1"+
    "\1\0\4\1\1\11\1\1\1\11\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	int stComment = 0;
	int commentLine;
	StringBuffer string = new StringBuffer();

	private Symbol symbol(String name, int sym) {
		//System.out.println("name: " + name + " sym: " + sym);
		return new Symbol(sym, yyline, yycolumn);
	}

	private Symbol symbol(String name, int sym, Object val) {
		//System.out.println("name: " + name + " sym: " + sym + " val: " + val);
		return new Symbol(sym, yyline, yycolumn, val);
	}

	private void error(String message) {
		System.err.println("Lexical Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 222) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { 	if(stComment!=0)
		System.out.println("Comment started at line " + commentLine + " is not finished");
	return new Symbol(sym.EOF, yyline, yycolumn);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { error("Illegal character <"+ yytext()+"> @ Line " + (yyline+1));
            }
          case 62: break;
          case 2: 
            { return symbol("charconst", sym.CHAR_CONS, yytext());
            }
          case 63: break;
          case 3: 
            { return symbol("integerconst", sym.INT_CONST, yytext());
            }
          case 64: break;
          case 4: 
            { 
            }
          case 65: break;
          case 5: 
            { string.setLength(0); string.append( yytext() ); yybegin(STRING);
            }
          case 66: break;
          case 6: 
            { commentLine = yyline+1; stComment++; yybegin(COMMENT);
            }
          case 67: break;
          case 7: 
            { return symbol("(", sym.LEFT_PAR);
            }
          case 68: break;
          case 8: 
            { return symbol(")", sym.RIGHT_PAR);
            }
          case 69: break;
          case 9: 
            { return symbol("[", sym.LEFT_BRACKET);
            }
          case 70: break;
          case 10: 
            { return symbol("]", sym.RIGHT_BRACKET);
            }
          case 71: break;
          case 11: 
            { return symbol(";", sym.SEMICOLON);
            }
          case 72: break;
          case 12: 
            { return symbol(":", sym.COLON);
            }
          case 73: break;
          case 13: 
            { return symbol(",", sym.COMMA);
            }
          case 74: break;
          case 14: 
            { return symbol(".", sym.DOT);
            }
          case 75: break;
          case 15: 
            { return symbol("=", sym.EQUALS);
            }
          case 76: break;
          case 16: 
            { return symbol("+", sym.PLUS);
            }
          case 77: break;
          case 17: 
            { return symbol("-", sym.MINUS);
            }
          case 78: break;
          case 18: 
            { return symbol("/", sym.DIVIDE);
            }
          case 79: break;
          case 19: 
            { return symbol("*", sym.PRODUCT);
            }
          case 80: break;
          case 20: 
            { return symbol("^", sym.XOR);
            }
          case 81: break;
          case 21: 
            { return symbol("<", sym.LESS_THAN);
            }
          case 82: break;
          case 22: 
            { return symbol(">", sym.GREATER_THAN);
            }
          case 83: break;
          case 23: 
            { stComment++;
            }
          case 84: break;
          case 24: 
            { stComment--; if(stComment==0) yybegin(YYINITIAL);
            }
          case 85: break;
          case 25: 
            { string.append( yytext() );
            }
          case 86: break;
          case 26: 
            { string.append( yytext() );
                                       yybegin(YYINITIAL);
                                       return symbol("string literal" ,sym.STRING_LITERAL, string.toString());
            }
          case 87: break;
          case 27: 
            { string.append('\\');
            }
          case 88: break;
          case 28: 
            { return symbol("id", sym.ID, yytext());
            }
          case 89: break;
          case 29: 
            { return symbol("or", sym.OR);
            }
          case 90: break;
          case 30: 
            { return symbol("of", sym.OF);
            }
          case 91: break;
          case 31: 
            { return symbol("if", sym.IF);
            }
          case 92: break;
          case 32: 
            { return symbol("do", sym.DO);
            }
          case 93: break;
          case 33: 
            { return symbol(":=", sym.ASIGN);
            }
          case 94: break;
          case 34: 
            { return symbol("<=", sym.LESS_EQUAL);
            }
          case 95: break;
          case 35: 
            { return symbol("<>", sym.NOT_EQUAL);
            }
          case 96: break;
          case 36: 
            { return symbol(">=", sym.GREATER_EQUALS);
            }
          case 97: break;
          case 37: 
            { string.append('\t');
            }
          case 98: break;
          case 38: 
            { string.append('\r');
            }
          case 99: break;
          case 39: 
            { string.append('\"');
            }
          case 100: break;
          case 40: 
            { string.append('\n');
            }
          case 101: break;
          case 41: 
            { return symbol("end", sym.END);
            }
          case 102: break;
          case 42: 
            { return symbol("and", sym.AND);
            }
          case 103: break;
          case 43: 
            { return symbol("mod", sym.MOD);
            }
          case 104: break;
          case 44: 
            { return symbol("not", sym.NOT);
            }
          case 105: break;
          case 45: 
            { return symbol("div", sym.DIV);
            }
          case 106: break;
          case 46: 
            { return symbol("var", sym.VAR);
            }
          case 107: break;
          case 47: 
            { return symbol("true", sym.TRUE);
            }
          case 108: break;
          case 48: 
            { return symbol("then", sym.THEN);
            }
          case 109: break;
          case 49: 
            { return symbol("else", sym.ELSE);
            }
          case 110: break;
          case 50: 
            { return symbol("char", sym.CHAR);
            }
          case 111: break;
          case 51: 
            { return symbol("false", sym.FALSE);
            }
          case 112: break;
          case 52: 
            { return symbol("array", sym.ARRAY);
            }
          case 113: break;
          case 53: 
            { return symbol("begin", sym.BEGIN);
            }
          case 114: break;
          case 54: 
            { return symbol("while", sym.WHILE);
            }
          case 115: break;
          case 55: 
            { return symbol("writeln", sym.READ_LN);
            }
          case 116: break;
          case 56: 
            { return symbol("string", sym.STRING);
            }
          case 117: break;
          case 57: 
            { return symbol("program", sym.PROGRAM);
            }
          case 118: break;
          case 58: 
            { return symbol("boolean", sym.BOOLEAN);
            }
          case 119: break;
          case 59: 
            { return symbol("integer", sym.INTEGER);
            }
          case 120: break;
          case 60: 
            { return symbol("writeln", sym.WRITE_LN);
            }
          case 121: break;
          case 61: 
            { return symbol("procedure", sym.PROCEDURE);
            }
          case 122: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
