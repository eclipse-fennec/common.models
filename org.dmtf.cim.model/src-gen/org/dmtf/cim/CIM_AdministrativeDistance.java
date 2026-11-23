/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Administrative Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information in this class affects the choice of one protocol over another, when two protocols learn the same route. Properties define the preference of a protocol, called its distance. The lower the distance, the higher the preference for that protocol. This class affects ALL routes and contains the default distances. Specific administrative distances relative to an individual route and Forwarding Service are defined in the NextHopForwardedByService association, its AdminDistance property. 
 * 
 * AdministrativeDistance, being a global object, is weak to the AdminDomain that contains it. Hence, the AdminDomain keys are propagated to this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getDirectConnect <em>Direct Connect</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getStatic <em>Static</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getEBGP <em>EBGP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getEIGRPInternal <em>EIGRP Internal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getIGRP <em>IGRP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getOSPF <em>OSPF</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getISIS <em>ISIS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getRIP <em>RIP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getEGP <em>EGP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getEIGRPExternal <em>EIGRP External</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getIBGP <em>IBGP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getBGPLocal <em>BGP Local</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdministrativeDistance#getUnknown <em>Unknown</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::Routes' override.Name='string' override.Name.Key='true' override.Name.Description='This is the name of the AdministrativeDistance class.' override.Name.MaxLen='256' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_AdministrativeDistance extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping AdminDomain's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_AdminDomain.CreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping AdminDomain's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_AdminDomain.Name'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Direct Connect</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for directly connected peers. It has a default value of 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direct Connect</em>' attribute.
	 * @see #setDirectConnect(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_DirectConnect()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getDirectConnect();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getDirectConnect <em>Direct Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Connect</em>' attribute.
	 * @see #getDirectConnect()
	 * @generated
	 */
	void setDirectConnect(Integer value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for staticly connected peers. It has a default value of 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_Static()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getStatic();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #getStatic()
	 * @generated
	 */
	void setStatic(Integer value);

	/**
	 * Returns the value of the '<em><b>EBGP</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for peers using EBGP. It has a default value of 20.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EBGP</em>' attribute.
	 * @see #setEBGP(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_EBGP()
	 * @model default="20"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getEBGP();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getEBGP <em>EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EBGP</em>' attribute.
	 * @see #getEBGP()
	 * @generated
	 */
	void setEBGP(Integer value);

	/**
	 * Returns the value of the '<em><b>EIGRP Internal</b></em>' attribute.
	 * The default value is <code>"90"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for peers using internal EIGRP. It has a default value of 90.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EIGRP Internal</em>' attribute.
	 * @see #setEIGRPInternal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_EIGRPInternal()
	 * @model default="90"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getEIGRPInternal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getEIGRPInternal <em>EIGRP Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EIGRP Internal</em>' attribute.
	 * @see #getEIGRPInternal()
	 * @generated
	 */
	void setEIGRPInternal(Integer value);

	/**
	 * Returns the value of the '<em><b>IGRP</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for peers using IGRP. It has a default value of 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IGRP</em>' attribute.
	 * @see #setIGRP(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_IGRP()
	 * @model default="100"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getIGRP();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getIGRP <em>IGRP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IGRP</em>' attribute.
	 * @see #getIGRP()
	 * @generated
	 */
	void setIGRP(Integer value);

	/**
	 * Returns the value of the '<em><b>OSPF</b></em>' attribute.
	 * The default value is <code>"110"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for peers using OSPF. It has a default value of 110.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OSPF</em>' attribute.
	 * @see #setOSPF(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_OSPF()
	 * @model default="110"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getOSPF();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getOSPF <em>OSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OSPF</em>' attribute.
	 * @see #getOSPF()
	 * @generated
	 */
	void setOSPF(Integer value);

	/**
	 * Returns the value of the '<em><b>ISIS</b></em>' attribute.
	 * The default value is <code>"115"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for peers using ISIS. It has a default value of 115.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ISIS</em>' attribute.
	 * @see #setISIS(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_ISIS()
	 * @model default="115"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getISIS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getISIS <em>ISIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISIS</em>' attribute.
	 * @see #getISIS()
	 * @generated
	 */
	void setISIS(Integer value);

	/**
	 * Returns the value of the '<em><b>RIP</b></em>' attribute.
	 * The default value is <code>"120"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for peers using RIP. It has a default value of 120.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RIP</em>' attribute.
	 * @see #setRIP(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_RIP()
	 * @model default="120"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getRIP();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getRIP <em>RIP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RIP</em>' attribute.
	 * @see #getRIP()
	 * @generated
	 */
	void setRIP(Integer value);

	/**
	 * Returns the value of the '<em><b>EGP</b></em>' attribute.
	 * The default value is <code>"140"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for peers using EGP. It has a default value of 140.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EGP</em>' attribute.
	 * @see #setEGP(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_EGP()
	 * @model default="140"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getEGP();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getEGP <em>EGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EGP</em>' attribute.
	 * @see #getEGP()
	 * @generated
	 */
	void setEGP(Integer value);

	/**
	 * Returns the value of the '<em><b>EIGRP External</b></em>' attribute.
	 * The default value is <code>"170"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for peers using external EIGRP. It has a default value of 170.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EIGRP External</em>' attribute.
	 * @see #setEIGRPExternal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_EIGRPExternal()
	 * @model default="170"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getEIGRPExternal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getEIGRPExternal <em>EIGRP External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EIGRP External</em>' attribute.
	 * @see #getEIGRPExternal()
	 * @generated
	 */
	void setEIGRPExternal(Integer value);

	/**
	 * Returns the value of the '<em><b>IBGP</b></em>' attribute.
	 * The default value is <code>"200"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for peers using IBGP. It has a default value of 200.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IBGP</em>' attribute.
	 * @see #setIBGP(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_IBGP()
	 * @model default="200"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getIBGP();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getIBGP <em>IBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBGP</em>' attribute.
	 * @see #getIBGP()
	 * @generated
	 */
	void setIBGP(Integer value);

	/**
	 * Returns the value of the '<em><b>BGP Local</b></em>' attribute.
	 * The default value is <code>"200"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for peers using BGP locally. It has a default value of 200.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BGP Local</em>' attribute.
	 * @see #setBGPLocal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_BGPLocal()
	 * @model default="200"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getBGPLocal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getBGPLocal <em>BGP Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGP Local</em>' attribute.
	 * @see #getBGPLocal()
	 * @generated
	 */
	void setBGPLocal(Integer value);

	/**
	 * Returns the value of the '<em><b>Unknown</b></em>' attribute.
	 * The default value is <code>"255"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance for peers using an unknown protocol. It has a default value of 255.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unknown</em>' attribute.
	 * @see #setUnknown(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdministrativeDistance_Unknown()
	 * @model default="255"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getUnknown();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdministrativeDistance#getUnknown <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown</em>' attribute.
	 * @see #getUnknown()
	 * @generated
	 */
	void setUnknown(Integer value);

} // CIM_AdministrativeDistance
