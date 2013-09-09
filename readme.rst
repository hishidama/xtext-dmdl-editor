DMDL EditorX
============
DMDL EditorXは、
`Xtext <http://www.ne.jp/asahi/hishidama/home/tech/eclipse/xtext/index.html>`_ で作成している、
`Asakusa Framework <http://www.ne.jp/asahi/hishidama/home/tech/asakusafw/index.html>`_ のDMDLエディター（Eclipseプラグイン）です。


インストール方法
----------------
XtextのインストールされたEclipseが必要です。
`Xtextのダウンロードサイト <http://www.eclipse.org/Xtext/download.html>`_ の ``Full Eclipse`` を使うか、
既存のEclipseに ``Xtext 2.4.2`` をインストールしてください。

DMDL EditorXプラグインのインストールは、Eclipseの ``[新規ソフトウェアのインストール]`` で
更新サイトとして http://hishidama.github.io/xtext-dmdl-editor/site/ を指定して下さい。

起動した後で「Do you want to add the Xtext nature to the project 'プロジェクト名'?」という ``Xtext nature`` へ登録するかどうかを訊ねるダイアログが出ますので、OKを押してください。


出来ること
----------

* キーワードに色が付く。
     * 色は設定で変更できる。
* カーソル位置の括弧に対して、対応する括弧が（うっすらと）強調表示される。
* フォールディング（ソース上のブロックを閉じること）が出来る。
* アウトラインが表示される。
    * ``Ctrl+o`` でクイックアウトラインが表示される。
* 入力補完が使える。
    * Windowsの場合は ``Ctrl+Space`` 、UNIXの場合は ``Alt+/`` でキーワードを補完できる。
* ソースの整形が出来る。
    * ``Ctrl+Shift+F`` でソースを整形する。
* DMDLのエラーチェックが出来る。
    * 文法レベルのエラーは入力時に判定される。（Xtextの機能）
    * コンテキストメニューの ``[DMDL EditorX]→[DMDL error check]`` で構文解析・意味解析を行い、エラー箇所にマークを付ける。
        * Asakusa Framework本体のDMDLパーサーを呼び出す為、プロパティーページでAsakusa Frameworkの設定を行っておく必要がある。
    * Xtextの判定によるエラーは、エディター上でエラーが解消した時にエラーマークが削除される。DMDLパーサーで出たエラーは、再度エラーチェックを行わないと解消されない。
* ハイパーリンクのジャンプが出来る。
    * ``Ctrl`` を押しながら `別データモデルを参照しているプロパティー` や `別データモデルを参照しているデータモデル` をクリックすると、定義元へジャンプする。
    * または ``F3`` 。
* ハイパーリンクの検索が出来る。
    * データモデル名やプロパティー名を右クリックして ``[Find References]`` を選択すると、データモデル名やプロパティー名が使われている箇所を検索する。
* ハイパーリンクの改名が出来る。
    * データモデル名やプロパティー名を右クリックして ``[Rename Element]`` を選択すると、データモデル名やプロパティー名を変更できる。使われている箇所も連動して変更される。
* DMDLのデータモデルおよびプロパティーをウィザードで新規作成することが出来る。
    * コンテキストメニューの ``[DMDL EditorX]→[New DataModel]`` でウィザードが開く。あるいはメニューバーの ``[ファイル]→[新規]`` やツールバー。
* DMDLの属性（@directio.csvとか）の追加/削除が出来る。
    * コンテキストメニューの ``[DMDL EditorX]→[Add/Remove attribute of DataModel]`` でウィザードが開く。あるいはメニューバーの ``[ファイル]→[新規]`` やツールバー。
* DMDLからデータモデルクラス（Javaソース）の生成が出来る。
    * コンテキストメニューの ``[DMDL EditorX]→[DMDL compile]`` でコンパイルを行う。
        * Asakusa Framework本体のDMDLコンパイラーを呼び出す為、プロパティーページでAsakusa Frameworkの設定を行っておく必要がある。
    * エラーチェックと同様のプロパティーを使ってコンパイル対象を決定している。
* DMDLからImporter/Exporterの雛形クラスを作成することが出来る。
    * コンテキストメニューの ``[DMDL EditorX]→[New importer/exporter class]`` でウィザードが開く。あるいはメニューバーの ``[ファイル]→[新規]`` やツールバー。
        * DMDLのコンパイルによってスケルトンクラス（AbstractHogeCsvInputDescription等）が作られていることが前提。（無いと、生成されたクラスがコンパイルエラーになる）
* JavaソースからDMDLへのハイパーリンクによるジャンプが出来る。
    * データモデルクラスのクラス名・メソッド名を ``Ctrl`` を押しながらクリックして ``[Open DMDL]`` を選択すると、定義元のDMDLへジャンプする。
    * または ``Shift+F3`` 。
* Flow DSLからOperatorへのハイパーリンクによるジャンプが出来る。（DMDLとは直接関係ない機能だが）
    * オペレーターファクトリークラスのクラス名・メソッド名を ``Ctrl`` を押しながらクリックして ``[Open Operator]`` を選択すると、定義元のOperatorへジャンプする。
    * Asakusa Framework 0.5以降で使用可能。

