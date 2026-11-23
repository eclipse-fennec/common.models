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
 * A representation of the model object '<em><b>CIM Fibre Port Event Counters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the FibrePortEventCounters class is deprecated because FibrePort is deprecated. FCPortStatistics should be used instead, but it redefines the level at which data is collected. Therefore, there is no direct translation of the individual counters between the two classes. Deprecated description: This object defines error counters that are specific to a FibrePort.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGIsReceived <em>PLOG Is Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGIsSent <em>PLOG Is Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortEventCounters#getEOFAbortsReceived <em>EOF Aborts Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortEventCounters#getEOFAbortsTransmitted <em>EOF Aborts Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGOsReceived <em>PLOG Os Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGOsSent <em>PLOG Os Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGIsRejected <em>PLOG Is Rejected</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGOsRejected <em>PLOG Os Rejected</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortEventCounters()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_FCPortStatistics\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' keys='SystemCreationClassName,SystemName,DeviceCreationClassName,DeviceID,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_FibrePortEventCounters extends CIM_DeviceStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>PLOG Is Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of login frames received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PLOG Is Received</em>' attribute.
	 * @see #setPLOGIsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortEventCounters_PLOGIsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPLOGIsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGIsReceived <em>PLOG Is Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PLOG Is Received</em>' attribute.
	 * @see #getPLOGIsReceived()
	 * @generated
	 */
	void setPLOGIsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>PLOG Is Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of login frames sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PLOG Is Sent</em>' attribute.
	 * @see #setPLOGIsSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortEventCounters_PLOGIsSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPLOGIsSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGIsSent <em>PLOG Is Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PLOG Is Sent</em>' attribute.
	 * @see #getPLOGIsSent()
	 * @generated
	 */
	void setPLOGIsSent(Long value);

	/**
	 * Returns the value of the '<em><b>EOF Aborts Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of frames received that contain 'EOF Abort'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EOF Aborts Received</em>' attribute.
	 * @see #setEOFAbortsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortEventCounters_EOFAbortsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getEOFAbortsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortEventCounters#getEOFAbortsReceived <em>EOF Aborts Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOF Aborts Received</em>' attribute.
	 * @see #getEOFAbortsReceived()
	 * @generated
	 */
	void setEOFAbortsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>EOF Aborts Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of frames transmitted that contain 'EOF Abort'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EOF Aborts Transmitted</em>' attribute.
	 * @see #setEOFAbortsTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortEventCounters_EOFAbortsTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getEOFAbortsTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortEventCounters#getEOFAbortsTransmitted <em>EOF Aborts Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOF Aborts Transmitted</em>' attribute.
	 * @see #getEOFAbortsTransmitted()
	 * @generated
	 */
	void setEOFAbortsTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>PLOG Os Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of logouts that were received from various targets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PLOG Os Received</em>' attribute.
	 * @see #setPLOGOsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortEventCounters_PLOGOsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPLOGOsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGOsReceived <em>PLOG Os Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PLOG Os Received</em>' attribute.
	 * @see #getPLOGOsReceived()
	 * @generated
	 */
	void setPLOGOsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>PLOG Os Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of logout frames sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PLOG Os Sent</em>' attribute.
	 * @see #setPLOGOsSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortEventCounters_PLOGOsSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPLOGOsSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGOsSent <em>PLOG Os Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PLOG Os Sent</em>' attribute.
	 * @see #getPLOGOsSent()
	 * @generated
	 */
	void setPLOGOsSent(Long value);

	/**
	 * Returns the value of the '<em><b>PLOG Is Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of PLOGI frames sent where the response was LS_RJT.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PLOG Is Rejected</em>' attribute.
	 * @see #setPLOGIsRejected(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortEventCounters_PLOGIsRejected()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPLOGIsRejected();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGIsRejected <em>PLOG Is Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PLOG Is Rejected</em>' attribute.
	 * @see #getPLOGIsRejected()
	 * @generated
	 */
	void setPLOGIsRejected(Long value);

	/**
	 * Returns the value of the '<em><b>PLOG Os Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of PLOGO frames sent where the response was LS_RJT.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PLOG Os Rejected</em>' attribute.
	 * @see #setPLOGOsRejected(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortEventCounters_PLOGOsRejected()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPLOGOsRejected();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibrePortEventCounters#getPLOGOsRejected <em>PLOG Os Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PLOG Os Rejected</em>' attribute.
	 * @see #getPLOGOsRejected()
	 * @generated
	 */
	void setPLOGOsRejected(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Method to reset the Port event counters. The method takes as input an integer that indicates which counter to reset. For this input parameter, 0 indicates all and 1 through 8 indicate a reset of the individual counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the instrumentation of the Device, which tabulates the errors and warnings, can also reset its internal processing and counters. 
	 * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier.
	 * @param SelectedCounter The counter to reset.
	 * <!-- end-model-doc -->
	 * @model SelectedCounterAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"All\",\"PLOGIsReceived\",\"PLOGIsSent\",\"EOFAbortsReceived\",\"EOFAbortsTransmitted\",\"PLOGOsReceived\",\"PLOGOsSent\",\"PLOGIsRejected\",\"PLOGOsRejected\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_FCPortStatistics.ResetSelectedStats\"]'"
	 * @generated
	 */
	Long ResetCounter(Integer SelectedCounter);

} // CIM_FibrePortEventCounters
