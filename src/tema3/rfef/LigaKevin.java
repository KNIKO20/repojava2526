package tema3.rfef;

import java.util.Random;

public class LigaKevin {
	private EquipoFutbolKevin equipo1;
	private EquipoFutbolKevin equipo2;
	private EquipoFutbolKevin equipo3;
	private EquipoFutbolKevin equipo4;
	public LigaKevin(EquipoFutbolKevin equipo1, EquipoFutbolKevin equipo2, EquipoFutbolKevin equipo3, EquipoFutbolKevin equipo4) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.equipo3 = equipo3;
		this.equipo4 = equipo4;
	}
	public EquipoFutbolKevin getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(EquipoFutbolKevin equipo1) {
		this.equipo1 = equipo1;
	}
	public EquipoFutbolKevin getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(EquipoFutbolKevin equipo2) {
		this.equipo2 = equipo2;
	}
	public EquipoFutbolKevin getEquipo3() {
		return equipo3;
	}
	public void setEquipo3(EquipoFutbolKevin equipo3) {
		this.equipo3 = equipo3;
	}
	public EquipoFutbolKevin getEquipo4() {
		return equipo4;
	}
	public void setEquipo4(EquipoFutbolKevin equipo4) {
		this.equipo4 = equipo4;
	}
	public void listarPuntos() {
		System.out.println("\nClasificación de la jornada");
		System.out.println(equipo1.getNombreEquipo()+": "+equipo1.getPuntos());
		System.out.println(equipo2.getNombreEquipo()+": "+equipo2.getPuntos());
		System.out.println(equipo3.getNombreEquipo()+": "+equipo3.getPuntos());
		System.out.println(equipo4.getNombreEquipo()+": "+equipo4.getPuntos()+"\n");
	}
	public void pichichi() {
		int pichichi1 = equipo1.getPichichiEquipo().getGolesAnotados();
		int pichichi2 = equipo2.getPichichiEquipo().getGolesAnotados();
		int pichichi3 = equipo3.getPichichiEquipo().getGolesAnotados();
		int pichichi4 = equipo4.getPichichiEquipo().getGolesAnotados();
		if(pichichi1 > pichichi2) {
			if(pichichi1 > pichichi3) {
				if(pichichi1 > pichichi4) {
					System.out.println("El pichichi de esta temporada es: "+equipo1.getPichichiEquipo().getNombre()+"\t| Goles: "+equipo1.getPichichiEquipo().getGolesAnotados()+"\t| Equipo: "+equipo1.getNombreEquipo());
				} else {
					System.out.println("El pichichi de esta temporada es: "+equipo4.getPichichiEquipo().getNombre()+"\t| Goles: "+equipo4.getPichichiEquipo().getGolesAnotados()+"\t| Equipo: "+equipo4.getNombreEquipo());
				}
			} else {
				if(pichichi3 > pichichi4) {
					System.out.println("El pichichi de esta temporada es: "+equipo3.getPichichiEquipo().getNombre()+"\t| Goles: "+equipo3.getPichichiEquipo().getGolesAnotados()+"\t| Equipo: "+equipo3.getNombreEquipo());
				} else {
					System.out.println("El pichichi de esta temporada es: "+equipo4.getPichichiEquipo().getNombre()+"\t| Goles: "+equipo4.getPichichiEquipo().getGolesAnotados()+"\t| Equipo: "+equipo4.getNombreEquipo());
				}
			}
		} else {
			if(pichichi2 > pichichi3) {
				if(pichichi2 > pichichi4) {
					System.out.println("El pichichi de esta temporada es: "+equipo2.getPichichiEquipo().getNombre()+"\t| Goles: "+equipo2.getPichichiEquipo().getGolesAnotados()+"\t| Equipo: "+equipo2.getNombreEquipo());
				} else {
					System.out.println("El pichichi de esta temporada es: "+equipo4.getPichichiEquipo().getNombre()+"\t| Goles: "+equipo4.getPichichiEquipo().getGolesAnotados()+"\t| Equipo: "+equipo4.getNombreEquipo());
				}
			} else {
				if(pichichi3 > pichichi4) {
					System.out.println("El pichichi de esta temporada es: "+equipo3.getPichichiEquipo().getNombre()+"\t| Goles: "+equipo3.getPichichiEquipo().getGolesAnotados()+"\t| Equipo: "+equipo3.getNombreEquipo());
				} else {
					System.out.println("El pichichi de esta temporada es: "+equipo4.getPichichiEquipo().getNombre()+"\t| Goles: "+equipo4.getPichichiEquipo().getGolesAnotados()+"\t| Equipo: "+equipo4.getNombreEquipo());
				}
			}
		}
	}
	public void samora() {
		if(equipo1.getPorteroTitular().getGolesRecibidos() < equipo2.getPorteroTitular().getGolesRecibidos()) {
			if(equipo1.getPorteroTitular().getGolesRecibidos() < equipo3.getPorteroTitular().getGolesRecibidos()) {
				if(equipo1.getPorteroTitular().getGolesRecibidos() < equipo4.getPorteroTitular().getGolesRecibidos()) {
					System.out.println("El premio Samora de esta temporada es para: "+equipo1.getPorteroTitular().getNombre()+"\t| Goles recibidos: "+equipo1.getPorteroTitular().getGolesRecibidos()+"\t| Equipo: "+equipo1.getNombreEquipo());
				} else {
					System.out.println("El premio Samora de esta temporada es para: "+equipo4.getPorteroTitular().getNombre()+"\t| Goles recibidos: "+equipo4.getPorteroTitular().getGolesRecibidos()+"\t| Equipo: "+equipo4.getNombreEquipo());
				}
			} else {
				if(equipo3.getPorteroTitular().getGolesRecibidos() < equipo4.getPorteroTitular().getGolesRecibidos()) {
					System.out.println("El premio Samora de esta temporada es para: "+equipo3.getPorteroTitular().getNombre()+"\t| Goles recibidos: "+equipo3.getPorteroTitular().getGolesRecibidos()+"\t| Equipo: "+equipo3.getNombreEquipo());
				} else {
					System.out.println("El premio Samora de esta temporada es para: "+equipo4.getPorteroTitular().getNombre()+"\t| Goles recibidos: "+equipo4.getPorteroTitular().getGolesRecibidos()+"\t| Equipo: "+equipo4.getNombreEquipo());
				}
			}
		} else {
			if(equipo2.getPorteroTitular().getGolesRecibidos() < equipo3.getPorteroTitular().getGolesRecibidos()) {
				if(equipo2.getPorteroTitular().getGolesRecibidos() < equipo4.getPorteroTitular().getGolesRecibidos()) {
					System.out.println("El premio Samora de esta temporada es para: "+equipo2.getPorteroTitular().getNombre()+"\t| Goles recibidos: "+equipo2.getPorteroTitular().getGolesRecibidos()+"\t| Equipo: "+equipo2.getNombreEquipo());
				} else {
					System.out.println("El premio Samora de esta temporada es para: "+equipo4.getPorteroTitular().getNombre()+"\t| Goles recibidos: "+equipo4.getPorteroTitular().getGolesRecibidos()+"\t| Equipo: "+equipo4.getNombreEquipo());
				}
			} else {
				if(equipo3.getPorteroTitular().getGolesRecibidos() < equipo4.getPorteroTitular().getGolesRecibidos()) {
					System.out.println("El premio Samora de esta temporada es para: "+equipo3.getPorteroTitular().getNombre()+"\t| Goles recibidos: "+equipo3.getPorteroTitular().getGolesRecibidos()+"\t| Equipo: "+equipo3.getNombreEquipo());
				} else {
					System.out.println("El premio Samora de esta temporada es para: "+equipo4.getPorteroTitular().getNombre()+"\t| Goles recibidos: "+equipo4.getPorteroTitular().getGolesRecibidos()+"\t| Equipo: "+equipo4.getNombreEquipo());
				}
			}
		}
	}
	
	
	public void simularPartido(EquipoFutbolKevin equipoLocal, EquipoFutbolKevin equipoVisitante) {
		Random random = new Random();
		int golesEquipoLocal = random.nextInt(6);
		int golesEquipoVisita = random.nextInt(6);
		System.out.println("("+equipoLocal.getNombreEquipo()+") "+golesEquipoLocal+" : "+golesEquipoVisita+" ("+equipoVisitante.getNombreEquipo()+")");
		equipoLocal.getDelanteroCentro().setGolesAnotados(golesEquipoLocal);
		equipoVisitante.getDelanteroCentro().setGolesAnotados(golesEquipoVisita);
		equipoLocal.getCentrocampista1().setNumAsistencias(golesEquipoLocal/2);
		equipoVisitante.getCentrocampista1().setNumAsistencias(golesEquipoVisita/2);
		equipoLocal.getCentral1().setPenaltisCometidos(random.nextInt(14));
		equipoVisitante.getCentral1().setPenaltisCometidos(random.nextInt(14));
		equipoLocal.getPorteroTitular().setGolesRecibidos(golesEquipoVisita);
		equipoVisitante.getPorteroTitular().setGolesRecibidos(golesEquipoLocal);
		if (golesEquipoLocal == golesEquipoVisita) {
			equipoLocal.setPuntos(1);
			equipoVisitante.setPuntos(1);
		} else if (golesEquipoLocal > golesEquipoVisita) {
			equipoLocal.setPuntos(3);
		} else {
			equipoVisitante.setPuntos(3);
		}
	}
	public void clasificacionFinal() {

	        EquipoFutbolKevin primero, segundo, tercero, cuarto;

	        // Encuentra el mayor
	        if (equipo1.getPuntos() >= equipo2.getPuntos() && equipo1.getPuntos() >= equipo3.getPuntos() && equipo1.getPuntos() >= equipo4.getPuntos()) {
	            primero = equipo1;
	            if (equipo2.getPuntos() >= equipo3.getPuntos() && equipo2.getPuntos() >= equipo4.getPuntos()) {
	                segundo = equipo2;
	                if (equipo3.getPuntos() >= equipo4.getPuntos()) {
	                    tercero = equipo3;
	                    cuarto = equipo4;
	                } else {
	                    tercero = equipo4;
	                    cuarto = equipo3;
	                }
	            } else if (equipo3.getPuntos() >= equipo2.getPuntos() && equipo3.getPuntos() >= equipo4.getPuntos()) {
	                segundo = equipo3;
	                if (equipo2.getPuntos() >= equipo4.getPuntos()) {
	                    tercero = equipo2;
	                    cuarto = equipo4;
	                } else {
	                    tercero = equipo4;
	                    cuarto = equipo2;
	                }
	            } else {
	                segundo = equipo4;
	                if (equipo2.getPuntos() >= equipo3.getPuntos()) {
	                    tercero = equipo2;
	                    cuarto = equipo3;
	                } else {
	                    tercero = equipo3;
	                    cuarto = equipo2;
	                }
	            }
	        } else if (equipo2.getPuntos() >= equipo1.getPuntos() && equipo2.getPuntos() >= equipo3.getPuntos() && equipo2.getPuntos() >= equipo4.getPuntos()) {
	            primero = equipo2;
	            if (equipo1.getPuntos() >= equipo3.getPuntos() && equipo1.getPuntos() >= equipo4.getPuntos()) {
	                segundo = equipo1;
	                if (equipo3.getPuntos() >= equipo4.getPuntos()) {
	                    tercero = equipo3;
	                    cuarto = equipo4;
	                } else {
	                    tercero = equipo4;
	                    cuarto = equipo3;
	                }
	            } else if (equipo3.getPuntos() >= equipo1.getPuntos() && equipo3.getPuntos() >= equipo4.getPuntos()) {
	                segundo = equipo3;
	                if (equipo1.getPuntos() >= equipo4.getPuntos()) {
	                    tercero = equipo1;
	                    cuarto = equipo4;
	                } else {
	                    tercero = equipo4;
	                    cuarto = equipo1;
	                }
	            } else {
	                segundo = equipo4;
	                if (equipo1.getPuntos() >= equipo3.getPuntos()) {
	                    tercero = equipo1;
	                    cuarto = equipo3;
	                } else {
	                    tercero = equipo3;
	                    cuarto = equipo1;
	                }
	            }
	        } else if (equipo3.getPuntos() >= equipo1.getPuntos() && equipo3.getPuntos() >= equipo2.getPuntos() && equipo3.getPuntos() >= equipo4.getPuntos()) {
	            primero = equipo3;
	            if (equipo1.getPuntos() >= equipo2.getPuntos() && equipo1.getPuntos() >= equipo4.getPuntos()) {
	                segundo = equipo1;
	                if (equipo2.getPuntos() >= equipo4.getPuntos()) {
	                    tercero = equipo2;
	                    cuarto = equipo4;
	                } else {
	                    tercero = equipo4;
	                    cuarto = equipo2;
	                }
	            } else if (equipo2.getPuntos() >= equipo1.getPuntos() && equipo2.getPuntos() >= equipo4.getPuntos()) {
	                segundo = equipo2;
	                if (equipo1.getPuntos() >= equipo4.getPuntos()) {
	                    tercero = equipo1;
	                    cuarto = equipo4;
	                } else {
	                    tercero = equipo4;
	                    cuarto = equipo1;
	                }
	            } else {
	                segundo = equipo4;
	                if (equipo1.getPuntos() >= equipo2.getPuntos()) {
	                    tercero = equipo1;
	                    cuarto = equipo2;
	                } else {
	                    tercero = equipo2;
	                    cuarto = equipo1;
	                }
	            }
	        } else {
	            primero = equipo4;
	            if (equipo1.getPuntos() >= equipo2.getPuntos() && equipo1.getPuntos() >= equipo3.getPuntos()) {
	                segundo = equipo1;
	                if (equipo2.getPuntos() >= equipo3.getPuntos()) {
	                    tercero = equipo2;
	                    cuarto = equipo3;
	                } else {
	                    tercero = equipo3;
	                    cuarto = equipo2;
	                }
	            } else if (equipo2.getPuntos() >= equipo1.getPuntos() && equipo2.getPuntos() >= equipo3.getPuntos()) {
	                segundo = equipo2;
	                if (equipo1.getPuntos() >= equipo3.getPuntos()) {
	                    tercero = equipo1;
	                    cuarto = equipo3;
	                } else {
	                    tercero = equipo3;
	                    cuarto = equipo1;
	                }
	            } else {
	                segundo = equipo3;
	                if (equipo1.getPuntos() >= equipo2.getPuntos()) {
	                    tercero = equipo1;
	                    cuarto = equipo2;
	                } else {
	                    tercero = equipo2;
	                    cuarto = equipo1;
	                }
	            }
	        }
	        
	        System.out.println("----------------------------------------");
	        System.out.println("Clasificación de la liga:");
	        System.out.println("----------------------------------------");
	        System.out.println(primero.getNombreEquipo()+"  \t"+ primero.getPuntos()+"pts"+ "\t(CAMPEÓN)");
	        System.out.println(segundo.getNombreEquipo()+"  \t"+ segundo.getPuntos()+"pts");
	        System.out.println(tercero.getNombreEquipo()+"  \t"+ tercero.getPuntos()+"pts");
	        System.out.println(cuarto.getNombreEquipo()+"  \t"+ cuarto.getPuntos()+"pts"+ "\t(DESCENSO)");
	        
	}
	
	@Override
	public String toString() {
		return "Liga [equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", equipo3=" + equipo3 + ", equipo4=" + equipo4+ "]";
	}
	
}
