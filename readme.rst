DMDL EditorX
============
DMDL EditorXは、
`Xtext <http://www.ne.jp/asahi/hishidama/home/tech/eclipse/xtext/index.html>`_ で作成している、
`Asakusa Framework <http://www.ne.jp/asahi/hishidama/home/tech/asakusafw/index.html>`_ のDMDLエディター（Eclipseプラグイン）です。


インストール方法
----------------
XtextのインストールされたEclipseが必要です。
`Xtextのダウンロードサイト <http://www.eclipse.org/Xtext/download.html>`_ の ``Full Eclipse`` を使うか、
既存のEclipseに ``Xtext`` （2.4.2以降）をインストールしてください。

DMDL EditorXプラグインのインストールは、Eclipseの ``[新規ソフトウェアのインストール]`` で
更新サイトとして http://hishidama.github.io/xtext-dmdl-editor/site/ を指定して下さい。


出来ること
----------
詳細は `DMDL EditorXの説明サイト <http://www.ne.jp/asahi/hishidama/home/tech/soft/asakusafw/dmdl-editor/index.html>`_ を参照して下さい。

* キーワードに色が付く。
     * 色は設定で変更できる。
* カーソル位置の括弧に対して、対応する括弧が（うっすらと）強調表示される。
* フォールディング（ソース上のブロックを閉じること）が出来る。
* アウトラインが表示される。
    * ``Ctrl+o`` でクイックアウトラインが表示される。
* 階層を表示できる。
    * データモデル名を右クリックしてコンテキストメニューを開き、 ``[Open DataModel Hierarchy]`` を実行すると階層ビューが開く。
    * または ``F4`` 。
    * 階層ビューでは、データモデルを定義する元となっている（参照している）データモデルや、逆に自分を使用しているデータモデルを表示する。
    * アウトラインでは基本的に自分で定義したプロパティーしか表示されないが、階層表示では親モデルで定義されているプロパティーも表示される。
* 入力補完が使える。
    * Windowsの場合は ``Ctrl+Space`` 、UNIXの場合は ``Alt+/`` でキーワードを補完できる。
* ソースの整形が出来る。
    * ``Ctrl+Shift+F`` でソースを整形する。
    * プロパティーページで設定すれば、ファイル保存時に自動的に整形する。
* DMDLのエラーチェックが出来る。
    * 文法レベルのエラーは入力時に判定される。（Xtextの機能）
    * コンテキストメニューの ``[DMDL EditorX]→[DMDL error check]`` で構文解析・意味解析を行い、エラー箇所にマークを付ける。
        * Asakusa Framework本体のDMDLパーサーを呼び出す為、プロパティーページでAsakusa Frameworkの設定を行っておく必要がある。
    * Xtextの判定によるエラーは、エディター上でエラーが解消した時にエラーマークが削除される。DMDLパーサーで出たエラーは、再度エラーチェックを行わないと解消されない。
* データモデルクラス名でクリップボードにコピーできる。
    * データモデル名やプロパティー名を右クリックして ``[Copy Java Name]`` を選択すると、クリップボードにデータモデルクラス名やプロパティー名のキャメルケースがコピーされる。
* ハイパーリンクのジャンプが出来る。
    * ``Ctrl`` を押しながら `別データモデルを参照しているプロパティー` や `別データモデルを参照しているデータモデル` をクリックすると、定義元へジャンプする。
    * または ``F3`` 。
    * データモデル定義のモデル名を ``Ctrl`` を押しながらクリックすると、そのモデルから生成されたデータモデルクラス（Javaソース）へジャンプする。
* ハイパーリンクの検索が出来る。
    * データモデル名やプロパティー名を右クリックして ``[Find References]`` を選択すると、データモデル名やプロパティー名が使われている箇所を検索する。
* ハイパーリンクの改名が出来る。
    * データモデル名やプロパティー名を右クリックして ``[Rename Element]`` を選択すると、データモデル名やプロパティー名を変更できる。使われている箇所も連動して変更される。
* Javaでの使用箇所を検索できる。
    * データモデル名やプロパティー名を右クリックして ``[Asakusa DSL References]`` を選択すると、Javaソース上でデータモデルクラスやプロパティーが使われている箇所を検索する。
* DMDLのデータモデルおよびプロパティーをウィザードで新規作成することが出来る。
    * コンテキストメニューの ``[DMDL EditorX]→[New DataModel]`` でウィザードが開く。あるいはメニューバーの ``[ファイル]→[新規]`` やツールバー。
* DMDLの属性（@directio.csvとか）の追加/削除が出来る。
    * コンテキストメニューの ``[DMDL EditorX]→[Add/Remove attribute of DataModel]`` でウィザードが開く。あるいはメニューバーの ``[ファイル]→[新規]`` やツールバー。
* DMDLのデータモデル・プロパティー・属性を変更することが出来る。
    * DMDLエディター上で変更したいデータモデル上にカーソルを合わせ、ツールバーの ``[既存のデータモデルの編集]`` をクリックすると、変更するウィザードが開く。
* DMDLからデータモデルクラス（Javaソース）の生成が出来る。
    * コンテキストメニューの ``[DMDL EditorX]→[DMDL compile]`` でコンパイルを行う。
        * Asakusa Framework本体のDMDLコンパイラーを呼び出す為、プロパティーページでAsakusa Frameworkの設定を行っておく必要がある。
    * エラーチェックと同様のプロパティーを使ってコンパイル対象を決定している。
* DMDLからImporter/Exporterの雛形クラスを作成することが出来る。
    * コンテキストメニューの ``[DMDL EditorX]→[New importer/exporter class]`` でウィザードが開く。あるいはメニューバーの ``[ファイル]→[新規]`` やツールバー。
        * DMDLのコンパイルによってスケルトンクラス（AbstractHogeCsvInputDescription等）が作られていることが前提。（無いと、生成されたクラスがコンパイルエラーになる）

Javaエディターを拡張している機能もあります。

* JavaソースからDMDLへのハイパーリンクによるジャンプが出来る。
    * データモデルクラスのクラス名・メソッド名を ``Ctrl`` を押しながらクリックして ``[Open DMDL]`` を選択すると、定義元のDMDLへジャンプする。
    * または ``Shift+F3`` 。
    * Importer/Exporterのクラス名からもDMDLへジャンプできる。
* Javaソースからデータモデル名・プロパティー名でクリップボードにコピーできる。
    * データモデルクラスのクラス名・メソッド名を右クリックして ``[Copy DMDL Name]`` を選択すると、クリップボードにモデル名・プロパティー名がコピーされる。
* @Keyのgroup,orderの機能拡張。
    * プロパティー名にマウスカーソルを合わせるとプロパティーの情報がツールチップとして表示される。
    * プロパティー名を ``Ctrl`` を押しながらクリックすると、定義元のDMDLへジャンプする。
    * プロパティー名や「ASC」「DESC」の入力補完が出来る。
* Javadocの入力補完が出来る。
    * フィールドの型や@param,@returnの型がデータモデルクラスの場合、該当Javadocの入力補完候補にデータモデル名が表示される。
* フローでの演算子の使用箇所を検索できる。
    * Operatorクラスの演算子メソッドを右クリックして ``[Asakusa DSL References]→[Search in src/main(Flow)]`` を選択すると、JobFlow/FlowPart上で該当演算子が使われている箇所を検索する。
* MasterSelectionの使用箇所を検索できる。
    * OperatorクラスのMasterSelectionメソッドを右クリックして ``[Asakusa DSL References]→[Search in src/main(Operator)]`` を選択すると、Operatorクラス内で該当MasterSelectionが使われている箇所を検索する。

DMDLとは直接関係無い機能ですが、以下のようなことも出来ます。

* JobFlow・FlowPart・Batchクラスの雛形を作成することが出来る。
    * ``[ファイル]→[新規]`` の新規作成ウィザードを開き、DMDL EditorXの「New JobFlow class」「New FlowPart class」「New Batch class」。
* JobFlow・FlowPartのテストクラスの雛形を作成することが出来る。
    * ``[ファイル]→[新規]`` の新規作成ウィザードを開き、DMDL EditorXの「New JobFlow Test class」「New FlowPart Test class」。
* JobFlow・FlowPartのコンストラクターの引数およびフィールドを追加削除することが出来る。
    * Javaエディター上で右クリックしてコンテキストメニューを出し、 ``[Source]→[Modify JobFlow/FlowPart Field]`` を選択すると、編集ウィザードが起動する。
* Flow DSLからOperatorへのハイパーリンクによるジャンプが出来る。
    * オペレーターファクトリークラスのクラス名・メソッド名を ``Ctrl`` を押しながらクリックして ``[Open Operator]`` を選択すると、定義元のOperatorへジャンプする。
    * Asakusa Framework 0.5以降で使用可能。
* Operatorクラスの演算子メソッドを使っているFlow DSLを検索できる。
    * Javaエディター上の演算子メソッドで右クリックしてコンテキストメニューを出し、 ``[Asakusa DSL References]`` を選択すると、検索ビューに検索結果が表示される。
* Operatorクラスの演算子メソッドの雛形を作成することが出来る。
    * Javaエディター上で右クリックしてコンテキストメニューを出し、 ``[Source]→[New Operator Method]`` を選択すると、演算子作成ウィザードが起動する。
* Operatorクラス内の@MasterJoin等のselectionを扱う機能がある。
    * selectionに書かれたメソッド名を ``Ctrl`` を押しながらクリックすると、定義元の@MasterSelectionメソッドにジャンプする。
    * selection内のメソッド名の入力補完が出来る。
* JobFlow・FlowPartのテストクラスのExcelファイル名からExcelファイルへのハイパーリンクによるジャンプが出来る。
    * prepare()・vefify()の文字列内のExcelファイル名部分を ``Ctrl`` を押しながらクリックすると、src/test/resourcesの下にあるExcelファイルにジャンプする。
* バッチのコンパイルが出来る。
    * パッケージエクスプローラー上でBatchクラスを選択し、ツールバーの ``[バッチのコンパイル]`` をクリックすると、バッチをコンパイルする。

Asakusa Frameworkとは全く関係無い機能ですが、以下のような機能も含まれています。

* メソッドの実引数の順序を変更できる。
    * Javaエディター上でメソッドを右クリックしてコンテキストメニューを出し、 ``[Source]→[Modify Method Invocation]`` を選択すると、変更ウィザードが起動する。
* 文字列定数（ダブルクォーテーションで囲まれたString Literal）内の検索が出来る。
    * メニューバーの ``[Search]→[Search]`` で検索ダイアログを出し、「String Search」タブを選択する。

※一部の機能（Javaソースからのハイパーリンクによるジャンプや ``Ctrl+Shif+F3`` による検索ダイアログ等）については、プロジェクトにXtextネイチャーが追加されていないと使用できません。
dmdlファイルを開くことにより、そのプロジェクトにXtextネイチャーが追加されます。

