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
 * A representation of the model object '<em><b>CIM FC Port Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FCPortStatistics is the statistics for the FCPort.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getLIPCount <em>LIP Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getNOSCount <em>NOS Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getErrorFrames <em>Error Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getDumpedFrames <em>Dumped Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getLinkFailures <em>Link Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getLossOfSignalCounter <em>Loss Of Signal Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getLossOfSyncCounter <em>Loss Of Sync Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getPrimitiveSeqProtocolErrCount <em>Primitive Seq Protocol Err Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getCRCErrors <em>CRC Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getInvalidTransmissionWords <em>Invalid Transmission Words</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getFramesTooShort <em>Frames Too Short</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getFramesTooLong <em>Frames Too Long</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getAddressErrors <em>Address Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getBufferCreditNotProvided <em>Buffer Credit Not Provided</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getBufferCreditNotReceived <em>Buffer Credit Not Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getDelimiterErrors <em>Delimiter Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getEncodingDisparityErrors <em>Encoding Disparity Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getLinkResetsReceived <em>Link Resets Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getLinkResetsTransmitted <em>Link Resets Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getMulticastFramesReceived <em>Multicast Frames Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getMulticastFramesTransmitted <em>Multicast Frames Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getFBSYFrames <em>FBSY Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getPBSYFrames <em>PBSY Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getFRJTFrames <em>FRJT Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getPRJTFrames <em>PRJT Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getRXClass1Frames <em>RX Class1 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getTXClass1Frames <em>TX Class1 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getClass1FBSY <em>Class1 FBSY</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getClass1PBSY <em>Class1 PBSY</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getClass1FRJT <em>Class1 FRJT</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getClass1PRJT <em>Class1 PRJT</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getRXClass2Frames <em>RX Class2 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getTXClass2Frames <em>TX Class2 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getClass2FBSY <em>Class2 FBSY</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getClass2PBSY <em>Class2 PBSY</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getClass2FRJT <em>Class2 FRJT</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getClass2PRJT <em>Class2 PRJT</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getRXClass3Frames <em>RX Class3 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getTXClass3Frames <em>TX Class3 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getClass3FramesDiscarded <em>Class3 Frames Discarded</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getRXBroadcastFrames <em>RX Broadcast Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCPortStatistics#getTXBroadcastFrames <em>TX Broadcast Frames</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.51.0' UMLPackagePath='CIM::Device::FC' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FCPortStatistics extends CIM_NetworkPortStatistics {
	/**
	 * Returns the value of the '<em><b>LIP Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LIPCount is the number of LIP events that have occurred on an arbitrated loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LIP Count</em>' attribute.
	 * @see #setLIPCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_LIPCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getLIPCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getLIPCount <em>LIP Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LIP Count</em>' attribute.
	 * @see #getLIPCount()
	 * @generated
	 */
	void setLIPCount(Long value);

	/**
	 * Returns the value of the '<em><b>NOS Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NOSCount is the number of NOS events that have occurred on the switched fabric.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NOS Count</em>' attribute.
	 * @see #setNOSCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_NOSCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getNOSCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getNOSCount <em>NOS Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NOS Count</em>' attribute.
	 * @see #getNOSCount()
	 * @generated
	 */
	void setNOSCount(Long value);

	/**
	 * Returns the value of the '<em><b>Error Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ErrorFrames is the number of frames that have been received in error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Frames</em>' attribute.
	 * @see #setErrorFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_ErrorFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getErrorFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getErrorFrames <em>Error Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Frames</em>' attribute.
	 * @see #getErrorFrames()
	 * @generated
	 */
	void setErrorFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Dumped Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DumpedFrames is the number of frames that were lost due to a lack of host buffers available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dumped Frames</em>' attribute.
	 * @see #setDumpedFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_DumpedFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getDumpedFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getDumpedFrames <em>Dumped Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dumped Frames</em>' attribute.
	 * @see #getDumpedFrames()
	 * @generated
	 */
	void setDumpedFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Link Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LinkFailure is the number of times that a link error has occurred. This count is part of the Link Error Status Block (LESB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Failures</em>' attribute.
	 * @see #setLinkFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_LinkFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getLinkFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getLinkFailures <em>Link Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Failures</em>' attribute.
	 * @see #getLinkFailures()
	 * @generated
	 */
	void setLinkFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Loss Of Signal Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of times the signal is lost on the Port since the last reset of the Device. This count is part of the Link Error Status Block (LESB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loss Of Signal Counter</em>' attribute.
	 * @see #setLossOfSignalCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_LossOfSignalCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getLossOfSignalCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getLossOfSignalCounter <em>Loss Of Signal Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Of Signal Counter</em>' attribute.
	 * @see #getLossOfSignalCounter()
	 * @generated
	 */
	void setLossOfSignalCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Loss Of Sync Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of times that synchronization is lost on the Port since the last reset of the Device. Synchronization is assumed lost after a timeout period (identified by the Receiver TransmitterTimeout property) is exceeded. This count is part of the Link Error Status Block (LESB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loss Of Sync Counter</em>' attribute.
	 * @see #setLossOfSyncCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_LossOfSyncCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getLossOfSyncCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getLossOfSyncCounter <em>Loss Of Sync Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Of Sync Counter</em>' attribute.
	 * @see #getLossOfSyncCounter()
	 * @generated
	 */
	void setLossOfSyncCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Primitive Seq Protocol Err Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of primitive sequence protocol errors that are detected at this port. This count is part of the Link Error Status Block (LESB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primitive Seq Protocol Err Count</em>' attribute.
	 * @see #setPrimitiveSeqProtocolErrCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_PrimitiveSeqProtocolErrCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getPrimitiveSeqProtocolErrCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getPrimitiveSeqProtocolErrCount <em>Primitive Seq Protocol Err Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Seq Protocol Err Count</em>' attribute.
	 * @see #getPrimitiveSeqProtocolErrCount()
	 * @generated
	 */
	void setPrimitiveSeqProtocolErrCount(Long value);

	/**
	 * Returns the value of the '<em><b>CRC Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of times that the CRC in a frame does not match the CRC that is computed by the receiver. This count is part of the Link Error Status Block (LESB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CRC Errors</em>' attribute.
	 * @see #setCRCErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_CRCErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getCRCErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getCRCErrors <em>CRC Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRC Errors</em>' attribute.
	 * @see #getCRCErrors()
	 * @generated
	 */
	void setCRCErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Invalid Transmission Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of transmission words that had an invalid character (8b10b code violation) in one or more of its characters, had a K28.5 (8b10b control) in its second, third, or fourth character position, or had an incorrect Beginning Running Disparity. This count is part of the Link Error Status Block (LESB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invalid Transmission Words</em>' attribute.
	 * @see #setInvalidTransmissionWords(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_InvalidTransmissionWords()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getInvalidTransmissionWords();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getInvalidTransmissionWords <em>Invalid Transmission Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Transmission Words</em>' attribute.
	 * @see #getInvalidTransmissionWords()
	 * @generated
	 */
	void setInvalidTransmissionWords(Long value);

	/**
	 * Returns the value of the '<em><b>Frames Too Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames received that were shorter than 28 octets. The value of 28 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes. The count does not include SOF/EOF bytes, which are not data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames Too Short</em>' attribute.
	 * @see #setFramesTooShort(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_FramesTooShort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getFramesTooShort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getFramesTooShort <em>Frames Too Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames Too Short</em>' attribute.
	 * @see #getFramesTooShort()
	 * @generated
	 */
	void setFramesTooShort(Long value);

	/**
	 * Returns the value of the '<em><b>Frames Too Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames received that were longer than 2140 octets. The value of 2140 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes and 2112 bytes of payload.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames Too Long</em>' attribute.
	 * @see #setFramesTooLong(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_FramesTooLong()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getFramesTooLong();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getFramesTooLong <em>Frames Too Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames Too Long</em>' attribute.
	 * @see #getFramesTooLong()
	 * @generated
	 */
	void setFramesTooLong(Long value);

	/**
	 * Returns the value of the '<em><b>Address Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of frames received with unknown addressing. An example is an unknown SID or DID. The SID or DID is not known to the routing algorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Errors</em>' attribute.
	 * @see #setAddressErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_AddressErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getAddressErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getAddressErrors <em>Address Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Errors</em>' attribute.
	 * @see #getAddressErrors()
	 * @generated
	 */
	void setAddressErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Buffer Credit Not Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of occurrences when all input buffers of a port were full and outbound buffer-to-buffer credit was transitioned to zero. There is no credit to provide to the other side.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Credit Not Provided</em>' attribute.
	 * @see #setBufferCreditNotProvided(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_BufferCreditNotProvided()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getBufferCreditNotProvided();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getBufferCreditNotProvided <em>Buffer Credit Not Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Credit Not Provided</em>' attribute.
	 * @see #getBufferCreditNotProvided()
	 * @generated
	 */
	void setBufferCreditNotProvided(Long value);

	/**
	 * Returns the value of the '<em><b>Buffer Credit Not Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of transitions in or out of BBcredit zero state. The other side is not providing any credit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Credit Not Received</em>' attribute.
	 * @see #setBufferCreditNotReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_BufferCreditNotReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getBufferCreditNotReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getBufferCreditNotReceived <em>Buffer Credit Not Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Credit Not Received</em>' attribute.
	 * @see #getBufferCreditNotReceived()
	 * @generated
	 */
	void setBufferCreditNotReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Delimiter Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of invalid frame delimiters that are received at this port. An example is a frame with a class 2 start and a class 3 at the end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delimiter Errors</em>' attribute.
	 * @see #setDelimiterErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_DelimiterErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getDelimiterErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getDelimiterErrors <em>Delimiter Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter Errors</em>' attribute.
	 * @see #getDelimiterErrors()
	 * @generated
	 */
	void setDelimiterErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Encoding Disparity Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of disparity errors that are received at this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding Disparity Errors</em>' attribute.
	 * @see #setEncodingDisparityErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_EncodingDisparityErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getEncodingDisparityErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getEncodingDisparityErrors <em>Encoding Disparity Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding Disparity Errors</em>' attribute.
	 * @see #getEncodingDisparityErrors()
	 * @generated
	 */
	void setEncodingDisparityErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Link Resets Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of Link resets. This count is the number of LRs received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Resets Received</em>' attribute.
	 * @see #setLinkResetsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_LinkResetsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getLinkResetsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getLinkResetsReceived <em>Link Resets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Resets Received</em>' attribute.
	 * @see #getLinkResetsReceived()
	 * @generated
	 */
	void setLinkResetsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Link Resets Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of Link resets. This count is the number of LRs transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Resets Transmitted</em>' attribute.
	 * @see #setLinkResetsTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_LinkResetsTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getLinkResetsTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getLinkResetsTransmitted <em>Link Resets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Resets Transmitted</em>' attribute.
	 * @see #getLinkResetsTransmitted()
	 * @generated
	 */
	void setLinkResetsTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>Multicast Frames Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of Multicast Frames or Packets received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multicast Frames Received</em>' attribute.
	 * @see #setMulticastFramesReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_MulticastFramesReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getMulticastFramesReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getMulticastFramesReceived <em>Multicast Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicast Frames Received</em>' attribute.
	 * @see #getMulticastFramesReceived()
	 * @generated
	 */
	void setMulticastFramesReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Multicast Frames Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count of Multicast Frames or Packets transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multicast Frames Transmitted</em>' attribute.
	 * @see #setMulticastFramesTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_MulticastFramesTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getMulticastFramesTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getMulticastFramesTransmitted <em>Multicast Frames Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicast Frames Transmitted</em>' attribute.
	 * @see #getMulticastFramesTransmitted()
	 * @generated
	 */
	void setMulticastFramesTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>FBSY Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FBSYFrames is the number of times that FBSY was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FBSY Frames</em>' attribute.
	 * @see #setFBSYFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_FBSYFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|ErrorCounters|1.SWAPI_STATS_LBL_FBSY\"]'"
	 * @generated
	 */
	Long getFBSYFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getFBSYFrames <em>FBSY Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FBSY Frames</em>' attribute.
	 * @see #getFBSYFrames()
	 * @generated
	 */
	void setFBSYFrames(Long value);

	/**
	 * Returns the value of the '<em><b>PBSY Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PBSYFrames is the number of times that PBSY was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PBSY Frames</em>' attribute.
	 * @see #setPBSYFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_PBSYFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|ErrorCounters|1.SWAPI_STATS_LBL_PBSY\"]'"
	 * @generated
	 */
	Long getPBSYFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getPBSYFrames <em>PBSY Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PBSY Frames</em>' attribute.
	 * @see #getPBSYFrames()
	 * @generated
	 */
	void setPBSYFrames(Long value);

	/**
	 * Returns the value of the '<em><b>FRJT Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FRJTFrames is the number of times that FRJT was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FRJT Frames</em>' attribute.
	 * @see #setFRJTFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_FRJTFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|ErrorCounters|1.SWAPI_STATS_LBL_FRJT\"]'"
	 * @generated
	 */
	Long getFRJTFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getFRJTFrames <em>FRJT Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRJT Frames</em>' attribute.
	 * @see #getFRJTFrames()
	 * @generated
	 */
	void setFRJTFrames(Long value);

	/**
	 * Returns the value of the '<em><b>PRJT Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PRJTFrames is the number of times that PRJT was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PRJT Frames</em>' attribute.
	 * @see #setPRJTFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_PRJTFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|ErrorCounters|1.SWAPI_STATS_LBL_PRJT\"]'"
	 * @generated
	 */
	Long getPRJTFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getPRJTFrames <em>PRJT Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRJT Frames</em>' attribute.
	 * @see #getPRJTFrames()
	 * @generated
	 */
	void setPRJTFrames(Long value);

	/**
	 * Returns the value of the '<em><b>RX Class1 Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RXClass1Frames is the number of class 1 frames received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RX Class1 Frames</em>' attribute.
	 * @see #setRXClass1Frames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_RXClass1Frames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C1RF\"]'"
	 * @generated
	 */
	Long getRXClass1Frames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getRXClass1Frames <em>RX Class1 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RX Class1 Frames</em>' attribute.
	 * @see #getRXClass1Frames()
	 * @generated
	 */
	void setRXClass1Frames(Long value);

	/**
	 * Returns the value of the '<em><b>TX Class1 Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TXClass1Frames is the number of class 1 frames transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TX Class1 Frames</em>' attribute.
	 * @see #setTXClass1Frames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_TXClass1Frames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C1TF\"]'"
	 * @generated
	 */
	Long getTXClass1Frames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getTXClass1Frames <em>TX Class1 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TX Class1 Frames</em>' attribute.
	 * @see #getTXClass1Frames()
	 * @generated
	 */
	void setTXClass1Frames(Long value);

	/**
	 * Returns the value of the '<em><b>Class1 FBSY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class1FBSY is the number of times that FBSY was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class1 FBSY</em>' attribute.
	 * @see #setClass1FBSY(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_Class1FBSY()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C1FB\"]'"
	 * @generated
	 */
	Long getClass1FBSY();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getClass1FBSY <em>Class1 FBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class1 FBSY</em>' attribute.
	 * @see #getClass1FBSY()
	 * @generated
	 */
	void setClass1FBSY(Long value);

	/**
	 * Returns the value of the '<em><b>Class1 PBSY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class1PBSY is the number of times that PBSY was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class1 PBSY</em>' attribute.
	 * @see #setClass1PBSY(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_Class1PBSY()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C1PB\"]'"
	 * @generated
	 */
	Long getClass1PBSY();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getClass1PBSY <em>Class1 PBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class1 PBSY</em>' attribute.
	 * @see #getClass1PBSY()
	 * @generated
	 */
	void setClass1PBSY(Long value);

	/**
	 * Returns the value of the '<em><b>Class1 FRJT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class1FRJT is the number of times that FRJT was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class1 FRJT</em>' attribute.
	 * @see #setClass1FRJT(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_Class1FRJT()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C1FR\"]'"
	 * @generated
	 */
	Long getClass1FRJT();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getClass1FRJT <em>Class1 FRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class1 FRJT</em>' attribute.
	 * @see #getClass1FRJT()
	 * @generated
	 */
	void setClass1FRJT(Long value);

	/**
	 * Returns the value of the '<em><b>Class1 PRJT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class1PRJT is the number of times that PRJT was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class1 PRJT</em>' attribute.
	 * @see #setClass1PRJT(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_Class1PRJT()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C1PR\"]'"
	 * @generated
	 */
	Long getClass1PRJT();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getClass1PRJT <em>Class1 PRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class1 PRJT</em>' attribute.
	 * @see #getClass1PRJT()
	 * @generated
	 */
	void setClass1PRJT(Long value);

	/**
	 * Returns the value of the '<em><b>RX Class2 Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RXClass2Frames is the number of class 2 frames received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RX Class2 Frames</em>' attribute.
	 * @see #setRXClass2Frames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_RXClass2Frames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C2RF\"]'"
	 * @generated
	 */
	Long getRXClass2Frames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getRXClass2Frames <em>RX Class2 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RX Class2 Frames</em>' attribute.
	 * @see #getRXClass2Frames()
	 * @generated
	 */
	void setRXClass2Frames(Long value);

	/**
	 * Returns the value of the '<em><b>TX Class2 Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TXClass2Frames is the number of class 2 frames transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TX Class2 Frames</em>' attribute.
	 * @see #setTXClass2Frames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_TXClass2Frames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C2LF\"]'"
	 * @generated
	 */
	Long getTXClass2Frames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getTXClass2Frames <em>TX Class2 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TX Class2 Frames</em>' attribute.
	 * @see #getTXClass2Frames()
	 * @generated
	 */
	void setTXClass2Frames(Long value);

	/**
	 * Returns the value of the '<em><b>Class2 FBSY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class2FBSY is the number of times that FBSY was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class2 FBSY</em>' attribute.
	 * @see #setClass2FBSY(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_Class2FBSY()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C2FB\"]'"
	 * @generated
	 */
	Long getClass2FBSY();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getClass2FBSY <em>Class2 FBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class2 FBSY</em>' attribute.
	 * @see #getClass2FBSY()
	 * @generated
	 */
	void setClass2FBSY(Long value);

	/**
	 * Returns the value of the '<em><b>Class2 PBSY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class2PBSY is the number of times that PBSY was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class2 PBSY</em>' attribute.
	 * @see #setClass2PBSY(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_Class2PBSY()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C2PB\"]'"
	 * @generated
	 */
	Long getClass2PBSY();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getClass2PBSY <em>Class2 PBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class2 PBSY</em>' attribute.
	 * @see #getClass2PBSY()
	 * @generated
	 */
	void setClass2PBSY(Long value);

	/**
	 * Returns the value of the '<em><b>Class2 FRJT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class2FRJT is the number of times that FRJT was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class2 FRJT</em>' attribute.
	 * @see #setClass2FRJT(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_Class2FRJT()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C2FR\"]'"
	 * @generated
	 */
	Long getClass2FRJT();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getClass2FRJT <em>Class2 FRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class2 FRJT</em>' attribute.
	 * @see #getClass2FRJT()
	 * @generated
	 */
	void setClass2FRJT(Long value);

	/**
	 * Returns the value of the '<em><b>Class2 PRJT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class2PRJT is the number of times that PRJT was returned to the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class2 PRJT</em>' attribute.
	 * @see #setClass2PRJT(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_Class2PRJT()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C2PR\"]'"
	 * @generated
	 */
	Long getClass2PRJT();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getClass2PRJT <em>Class2 PRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class2 PRJT</em>' attribute.
	 * @see #getClass2PRJT()
	 * @generated
	 */
	void setClass2PRJT(Long value);

	/**
	 * Returns the value of the '<em><b>RX Class3 Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RXClass3Frames is the number of class 3 frames received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RX Class3 Frames</em>' attribute.
	 * @see #setRXClass3Frames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_RXClass3Frames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C3RF\"]'"
	 * @generated
	 */
	Long getRXClass3Frames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getRXClass3Frames <em>RX Class3 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RX Class3 Frames</em>' attribute.
	 * @see #getRXClass3Frames()
	 * @generated
	 */
	void setRXClass3Frames(Long value);

	/**
	 * Returns the value of the '<em><b>TX Class3 Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TXClass3Frames is the number of class 3 frames transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TX Class3 Frames</em>' attribute.
	 * @see #setTXClass3Frames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_TXClass3Frames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C3TF\"]'"
	 * @generated
	 */
	Long getTXClass3Frames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getTXClass3Frames <em>TX Class3 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TX Class3 Frames</em>' attribute.
	 * @see #getTXClass3Frames()
	 * @generated
	 */
	void setTXClass3Frames(Long value);

	/**
	 * Returns the value of the '<em><b>Class3 Frames Discarded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class3FramesDiscarded is the number of class 3 frames that were discarded upon reception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class3 Frames Discarded</em>' attribute.
	 * @see #setClass3FramesDiscarded(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_Class3FramesDiscarded()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_C3DC\"]'"
	 * @generated
	 */
	Long getClass3FramesDiscarded();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getClass3FramesDiscarded <em>Class3 Frames Discarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class3 Frames Discarded</em>' attribute.
	 * @see #getClass3FramesDiscarded()
	 * @generated
	 */
	void setClass3FramesDiscarded(Long value);

	/**
	 * Returns the value of the '<em><b>RX Broadcast Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RXBroadcastFrames is the number of broadcast frames or packets received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RX Broadcast Frames</em>' attribute.
	 * @see #setRXBroadcastFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_RXBroadcastFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_RBCO\"]'"
	 * @generated
	 */
	Long getRXBroadcastFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getRXBroadcastFrames <em>RX Broadcast Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RX Broadcast Frames</em>' attribute.
	 * @see #getRXBroadcastFrames()
	 * @generated
	 */
	void setRXBroadcastFrames(Long value);

	/**
	 * Returns the value of the '<em><b>TX Broadcast Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TXBroadcastFrames is the number of broadcast frames or packets transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TX Broadcast Frames</em>' attribute.
	 * @see #setTXBroadcastFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortStatistics_TXBroadcastFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"FC-SWAPI.T11|PerformanceCounters|1.SWAPI_STATS_LBL_TBCO\"]'"
	 * @generated
	 */
	Long getTXBroadcastFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortStatistics#getTXBroadcastFrames <em>TX Broadcast Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TX Broadcast Frames</em>' attribute.
	 * @see #getTXBroadcastFrames()
	 * @generated
	 */
	void setTXBroadcastFrames(Long value);

} // CIM_FCPortStatistics
