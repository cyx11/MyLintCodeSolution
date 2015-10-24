package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m_radius = 4;
		float[] m_mask = new float[(int) Math.pow(2*m_radius + 1, 2)];
		for (int i = 0; i < 2*m_radius + 1; i++) {
			for (int j = 0; j < 2*m_radius + 1; j++) {
				if ( Math.pow(i - m_radius, 2) + Math.pow(j - m_radius, 2) <= Math.pow(m_radius, 2) ) {
					m_mask[i*(2*m_radius + 1) + j] = (float) (1.0 - (Math.sqrt(Math.pow(i - m_radius, 2) + Math.pow(j - m_radius,2)) / (m_radius * 1.0)));
				} else {
					m_mask[i*(2*m_radius + 1) + j] = (float) 0.0;
				};
			}
		}
		for (int i = 0; i < 2*m_radius + 1; i++) {
			for (int j = 0; j < 2*m_radius + 1; j++) {
				System.out.print(m_mask[i*(2*m_radius + 1) + j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println((-8)%5);
	}
}
