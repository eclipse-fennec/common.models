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
 * A representation of the model object '<em><b>CIM FC Adapter Event Counters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the FCAdapterEventCounters class is deprecated because FibreChannelAdapter is deprecated. FCPortStatistics should be used instead, but it redefines the level at which data is collected. Therefore, there is no direct translation of the individual counters between the two classes. This object describes event counters that were specific to a FibreChannelAdapter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getABTSFramesReceived <em>ABTS Frames Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getABTSFramesSent <em>ABTS Frames Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getFBSYsReceived <em>FBS Ys Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPBSYsReceived <em>PBS Ys Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPBSYsSent <em>PBS Ys Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getFRJTsReceived <em>FRJ Ts Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPRJTsReceived <em>PRJ Ts Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPRJTsSent <em>PRJ Ts Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPRLIsRejected <em>PRL Is Rejected</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPRLOsRejected <em>PRL Os Rejected</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getABTSFramesRejected <em>ABTS Frames Rejected</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_FCPortStatistics\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' keys='SystemCreationClassName,SystemName,DeviceCreationClassName,DeviceID,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_FCAdapterEventCounters extends CIM_DeviceStatisticalInformation {
	/**
	 * Returns the value of the '<em><b>ABTS Frames Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of Abort sequence frames received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ABTS Frames Received</em>' attribute.
	 * @see #setABTSFramesReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters_ABTSFramesReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getABTSFramesReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getABTSFramesReceived <em>ABTS Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ABTS Frames Received</em>' attribute.
	 * @see #getABTSFramesReceived()
	 * @generated
	 */
	void setABTSFramesReceived(Long value);

	/**
	 * Returns the value of the '<em><b>ABTS Frames Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of Abort sequence frames sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ABTS Frames Sent</em>' attribute.
	 * @see #setABTSFramesSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters_ABTSFramesSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getABTSFramesSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getABTSFramesSent <em>ABTS Frames Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ABTS Frames Sent</em>' attribute.
	 * @see #getABTSFramesSent()
	 * @generated
	 */
	void setABTSFramesSent(Long value);

	/**
	 * Returns the value of the '<em><b>FBS Ys Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of frames busied by the Fabric.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FBS Ys Received</em>' attribute.
	 * @see #setFBSYsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters_FBSYsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getFBSYsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getFBSYsReceived <em>FBS Ys Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FBS Ys Received</em>' attribute.
	 * @see #getFBSYsReceived()
	 * @generated
	 */
	void setFBSYsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>PBS Ys Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of frames busied by the receiving Node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PBS Ys Received</em>' attribute.
	 * @see #setPBSYsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters_PBSYsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPBSYsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPBSYsReceived <em>PBS Ys Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PBS Ys Received</em>' attribute.
	 * @see #getPBSYsReceived()
	 * @generated
	 */
	void setPBSYsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>PBS Ys Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of frames busied by the Adapter itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PBS Ys Sent</em>' attribute.
	 * @see #setPBSYsSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters_PBSYsSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPBSYsSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPBSYsSent <em>PBS Ys Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PBS Ys Sent</em>' attribute.
	 * @see #getPBSYsSent()
	 * @generated
	 */
	void setPBSYsSent(Long value);

	/**
	 * Returns the value of the '<em><b>FRJ Ts Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of frames rejected by the Fabric.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FRJ Ts Received</em>' attribute.
	 * @see #setFRJTsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters_FRJTsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getFRJTsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getFRJTsReceived <em>FRJ Ts Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRJ Ts Received</em>' attribute.
	 * @see #getFRJTsReceived()
	 * @generated
	 */
	void setFRJTsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>PRJ Ts Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of frames rejected by the receiving Node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PRJ Ts Received</em>' attribute.
	 * @see #setPRJTsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters_PRJTsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPRJTsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPRJTsReceived <em>PRJ Ts Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRJ Ts Received</em>' attribute.
	 * @see #getPRJTsReceived()
	 * @generated
	 */
	void setPRJTsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>PRJ Ts Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of frames rejected by the Adapter itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PRJ Ts Sent</em>' attribute.
	 * @see #setPRJTsSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters_PRJTsSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPRJTsSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPRJTsSent <em>PRJ Ts Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRJ Ts Sent</em>' attribute.
	 * @see #getPRJTsSent()
	 * @generated
	 */
	void setPRJTsSent(Long value);

	/**
	 * Returns the value of the '<em><b>PRL Is Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of PRLI frames sent where the response was LS_RJT.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PRL Is Rejected</em>' attribute.
	 * @see #setPRLIsRejected(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters_PRLIsRejected()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPRLIsRejected();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPRLIsRejected <em>PRL Is Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRL Is Rejected</em>' attribute.
	 * @see #getPRLIsRejected()
	 * @generated
	 */
	void setPRLIsRejected(Long value);

	/**
	 * Returns the value of the '<em><b>PRL Os Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of PRLO frames sent where the response was LS_RJT.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PRL Os Rejected</em>' attribute.
	 * @see #setPRLOsRejected(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters_PRLOsRejected()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getPRLOsRejected();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getPRLOsRejected <em>PRL Os Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRL Os Rejected</em>' attribute.
	 * @see #getPRLOsRejected()
	 * @generated
	 */
	void setPRLOsRejected(Long value);

	/**
	 * Returns the value of the '<em><b>ABTS Frames Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of Abort sequence frames sent where the response was BA_RJT.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ABTS Frames Rejected</em>' attribute.
	 * @see #setABTSFramesRejected(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCAdapterEventCounters_ABTSFramesRejected()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getABTSFramesRejected();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCAdapterEventCounters#getABTSFramesRejected <em>ABTS Frames Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ABTS Frames Rejected</em>' attribute.
	 * @see #getABTSFramesRejected()
	 * @generated
	 */
	void setABTSFramesRejected(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Method to reset the Adapter event counters. The method takes, as input, an integer that indicates which counter to reset. For this input 0 indicates all and 1 through 11 indicate a reset of the individual counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the instrumentation of the Device, which tabulates the errors and warnings, can also reset its internal processing and counters. 
	 * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier.
	 * @param SelectedCounter The counter to reset.
	 * <!-- end-model-doc -->
	 * @model SelectedCounterAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"All\",\"ABTSFramesReceived\",\"ABTSFramesSent\",\"FBSYReceived\",\"PBSYReceived\",\"PBSYSent\",\"FRJTReceived\",\"PRJTReceived\",\"PRJTSent\",\"PRLIRejected\",\"PRLORejected\",\"ABTSFramesRejected\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_FCPortStatistics.ResetSelectedStats()\"]'"
	 * @generated
	 */
	Long ResetCounter(Integer SelectedCounter);

} // CIM_FCAdapterEventCounters
