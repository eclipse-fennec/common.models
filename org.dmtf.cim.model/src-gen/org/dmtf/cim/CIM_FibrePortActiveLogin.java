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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Fibre Port Active Login</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of FibrePortActiveLogin is deprecated because FibrePort is deprecated. 
 * Deprecated description: Information for FibrePortActiveLogin is found by examining the individual FCPorts, and an ActiveConnection between the FCProtocolEndpoints that are associated with the ports. FibrePortActiveLogin indicates that two FibrePorts are connected through a login and have negotiated their Class Of Service, frame size, and other link characteristics, as specified by an instance of this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getLoginOriginator <em>Login Originator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getLoginResponder <em>Login Responder</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getNegotiatedCOS <em>Negotiated COS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getNegotiatedFrameSize <em>Negotiated Frame Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getNegotiatedSpeed <em>Negotiated Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getACKModel <em>ACK Model</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getBufferToBufferModel <em>Buffer To Buffer Model</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getOriginatorBufferCredit <em>Originator Buffer Credit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getResponderBufferCredit <em>Responder Buffer Credit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getOriginatorEndCredit <em>Originator End Credit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getResponderEndCredit <em>Responder End Credit</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ActiveConnection\",\"CIM_FCPort\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' keys='LoginOriginator,LoginResponder,NegotiatedCOS'"
 * @generated
 */
@ProviderType
public interface CIM_FibrePortActiveLogin extends EObject {
	/**
	 * Returns the value of the '<em><b>Login Originator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The originator of the login.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Login Originator</em>' reference.
	 * @see #setLoginOriginator(CIM_FibrePort)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin_LoginOriginator()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FibrePort REF' Deprecated='[\"CIM_ActiveConnection.Dependent\"]' Key='true'"
	 * @generated
	 */
	CIM_FibrePort getLoginOriginator();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getLoginOriginator <em>Login Originator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Originator</em>' reference.
	 * @see #getLoginOriginator()
	 * @generated
	 */
	void setLoginOriginator(CIM_FibrePort value);

	/**
	 * Returns the value of the '<em><b>Login Responder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The responder to the login.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Login Responder</em>' reference.
	 * @see #setLoginResponder(CIM_FibrePort)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin_LoginResponder()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FibrePort REF' Deprecated='[\"CIM_ActiveConnection.Antecedent\"]' Key='true'"
	 * @generated
	 */
	CIM_FibrePort getLoginResponder();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getLoginResponder <em>Login Responder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Responder</em>' reference.
	 * @see #getLoginResponder()
	 * @generated
	 */
	void setLoginResponder(CIM_FibrePort value);

	/**
	 * Returns the value of the '<em><b>Negotiated COS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The Fibre Channel Class of Service that is currently running between the Ports. Because two Ports can be simultaneously connected at different Classes of Service, this property had to be part of the key of the object and therefore, the identity of the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negotiated COS</em>' attribute.
	 * @see #setNegotiatedCOS(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin_NegotiatedCOS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_FCPort.ActiveCOS\"]' Key='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"1\",\"2\",\"3\",\"4\",\"6\",\"F\"]' MappingStrings='[\"MIF.DMTF|Fibre Channel Bus PortExtensions|001.5\"]' ModelCorrespondence='[\"CIM_FibreChannelAdapter.SupportedCOS\"]'"
	 * @generated
	 */
	Integer getNegotiatedCOS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getNegotiatedCOS <em>Negotiated COS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negotiated COS</em>' attribute.
	 * @see #getNegotiatedCOS()
	 * @generated
	 */
	void setNegotiatedCOS(Integer value);

	/**
	 * Returns the value of the '<em><b>Negotiated Frame Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The Fibre Channel frame size, in bytes, that is currently negotiated between the two Ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negotiated Frame Size</em>' attribute.
	 * @see #setNegotiatedFrameSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin_NegotiatedFrameSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPort.ActiveMaximumTransmissionUnit\"]' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getNegotiatedFrameSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getNegotiatedFrameSize <em>Negotiated Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negotiated Frame Size</em>' attribute.
	 * @see #getNegotiatedFrameSize()
	 * @generated
	 */
	void setNegotiatedFrameSize(Long value);

	/**
	 * Returns the value of the '<em><b>Negotiated Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The speed for communications that is currently negotiated between the two Ports. Speed is specified in Bits per Second. If this information is not available, the property should be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negotiated Speed</em>' attribute.
	 * @see #setNegotiatedSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin_NegotiatedSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPort.Speed\"]' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getNegotiatedSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getNegotiatedSpeed <em>Negotiated Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negotiated Speed</em>' attribute.
	 * @see #getNegotiatedSpeed()
	 * @generated
	 */
	void setNegotiatedSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>ACK Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Acknowledgement model that is negotiated during Port login. For example, ACK-1 indicates that each frame should be acknowledged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ACK Model</em>' attribute.
	 * @see #setACKModel(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin_ACKModel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"ACK-0\",\"ACK-1\",\"ACK-N\"]' MappingStrings='[\"MIF.DMTF|Fibre Channel Bus PortExtensions|001.6\"]'"
	 * @generated
	 */
	Integer getACKModel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getACKModel <em>ACK Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACK Model</em>' attribute.
	 * @see #getACKModel()
	 * @generated
	 */
	void setACKModel(Integer value);

	/**
	 * Returns the value of the '<em><b>Buffer To Buffer Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The buffer-to-buffer model that was negotiated during Port login. Either the model defined by the FC-PH standard is used (value=1, "Regular") or an "Alternate" model is negotiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer To Buffer Model</em>' attribute.
	 * @see #setBufferToBufferModel(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin_BufferToBufferModel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Regular\",\"Alternate\"]'"
	 * @generated
	 */
	Integer getBufferToBufferModel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getBufferToBufferModel <em>Buffer To Buffer Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer To Buffer Model</em>' attribute.
	 * @see #getBufferToBufferModel()
	 * @generated
	 */
	void setBufferToBufferModel(Integer value);

	/**
	 * Returns the value of the '<em><b>Originator Buffer Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: OriginatorBufferCredit reflects the buffer credit of the Port that is defined as the LoginOriginator. This method is the number of frame buffers that were made available by the originating Port to the responder Port. Buffer credits are used in point-to- point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Buffer Credit</em>' attribute.
	 * @see #setOriginatorBufferCredit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin_OriginatorBufferCredit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' MappingStrings='[\"MIF.DMTF|Fibre Channel Bus PortExtensions|001.3\"]'"
	 * @generated
	 */
	Long getOriginatorBufferCredit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getOriginatorBufferCredit <em>Originator Buffer Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator Buffer Credit</em>' attribute.
	 * @see #getOriginatorBufferCredit()
	 * @generated
	 */
	void setOriginatorBufferCredit(Long value);

	/**
	 * Returns the value of the '<em><b>Responder Buffer Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: ResponderBufferCredit reflects the buffer credit of the Port that is defined as the LoginResponder. This method is the number of frame buffers that were made available by the responder Port to the originating Port. Buffer credits are used in point-to-point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responder Buffer Credit</em>' attribute.
	 * @see #setResponderBufferCredit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin_ResponderBufferCredit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' MappingStrings='[\"MIF.DMTF|Fibre Channel Bus PortExtensions|001.3\"]'"
	 * @generated
	 */
	Long getResponderBufferCredit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getResponderBufferCredit <em>Responder Buffer Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responder Buffer Credit</em>' attribute.
	 * @see #getResponderBufferCredit()
	 * @generated
	 */
	void setResponderBufferCredit(Long value);

	/**
	 * Returns the value of the '<em><b>Originator End Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: OriginatorEndCredit reflects the end credit of the Port that is defined as the LoginOriginator. This method is the number of frame buffers that were made available by the originating Port to the responder Port. End credits are used in point-to-point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator End Credit</em>' attribute.
	 * @see #setOriginatorEndCredit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin_OriginatorEndCredit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' MappingStrings='[\"MIF.DMTF|Fibre Channel Bus PortExtensions|001.2\"]'"
	 * @generated
	 */
	Long getOriginatorEndCredit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getOriginatorEndCredit <em>Originator End Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator End Credit</em>' attribute.
	 * @see #getOriginatorEndCredit()
	 * @generated
	 */
	void setOriginatorEndCredit(Long value);

	/**
	 * Returns the value of the '<em><b>Responder End Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: ResponderEndCredit reflects the end credit of the Port that is defined as the LoginResponder. This method is the number of frame buffers that were made available by the responder Port to the originating Port. End credits are used in point-to-point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responder End Credit</em>' attribute.
	 * @see #setResponderEndCredit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortActiveLogin_ResponderEndCredit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' MappingStrings='[\"MIF.DMTF|Fibre Channel Bus PortExtensions|001.2\"]'"
	 * @generated
	 */
	Long getResponderEndCredit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortActiveLogin#getResponderEndCredit <em>Responder End Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responder End Credit</em>' attribute.
	 * @see #getResponderEndCredit()
	 * @generated
	 */
	void setResponderEndCredit(Long value);

} // CIM_FibrePortActiveLogin
