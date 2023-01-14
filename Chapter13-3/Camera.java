package extend;

// Cameraインターフェースの宣言
// インターフェースに指定できるアクセス修飾子は「public」か「package-private（何も書かない）」だけ
public interface Camera {

// public abstractが自動で追加され、public abstract takePicture();に変換される。
	public void takePicture();

}
