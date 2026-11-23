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
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_FCPortStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FC Port Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getLIPCount <em>LIP Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getNOSCount <em>NOS Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getErrorFrames <em>Error Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getDumpedFrames <em>Dumped Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getLinkFailures <em>Link Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getLossOfSignalCounter <em>Loss Of Signal Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getLossOfSyncCounter <em>Loss Of Sync Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getPrimitiveSeqProtocolErrCount <em>Primitive Seq Protocol Err Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getCRCErrors <em>CRC Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getInvalidTransmissionWords <em>Invalid Transmission Words</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getFramesTooShort <em>Frames Too Short</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getFramesTooLong <em>Frames Too Long</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getAddressErrors <em>Address Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getBufferCreditNotProvided <em>Buffer Credit Not Provided</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getBufferCreditNotReceived <em>Buffer Credit Not Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getDelimiterErrors <em>Delimiter Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getEncodingDisparityErrors <em>Encoding Disparity Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getLinkResetsReceived <em>Link Resets Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getLinkResetsTransmitted <em>Link Resets Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getMulticastFramesReceived <em>Multicast Frames Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getMulticastFramesTransmitted <em>Multicast Frames Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getFBSYFrames <em>FBSY Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getPBSYFrames <em>PBSY Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getFRJTFrames <em>FRJT Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getPRJTFrames <em>PRJT Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getRXClass1Frames <em>RX Class1 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getTXClass1Frames <em>TX Class1 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getClass1FBSY <em>Class1 FBSY</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getClass1PBSY <em>Class1 PBSY</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getClass1FRJT <em>Class1 FRJT</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getClass1PRJT <em>Class1 PRJT</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getRXClass2Frames <em>RX Class2 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getTXClass2Frames <em>TX Class2 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getClass2FBSY <em>Class2 FBSY</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getClass2PBSY <em>Class2 PBSY</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getClass2FRJT <em>Class2 FRJT</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getClass2PRJT <em>Class2 PRJT</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getRXClass3Frames <em>RX Class3 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getTXClass3Frames <em>TX Class3 Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getClass3FramesDiscarded <em>Class3 Frames Discarded</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getRXBroadcastFrames <em>RX Broadcast Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortStatisticsImpl#getTXBroadcastFrames <em>TX Broadcast Frames</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FCPortStatisticsImpl extends CIM_NetworkPortStatisticsImpl implements CIM_FCPortStatistics {
	/**
	 * The default value of the '{@link #getLIPCount() <em>LIP Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLIPCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long LIP_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLIPCount() <em>LIP Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLIPCount()
	 * @generated
	 * @ordered
	 */
	protected Long lipCount = LIP_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNOSCount() <em>NOS Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOSCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long NOS_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNOSCount() <em>NOS Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOSCount()
	 * @generated
	 * @ordered
	 */
	protected Long nosCount = NOS_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorFrames() <em>Error Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long ERROR_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorFrames() <em>Error Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorFrames()
	 * @generated
	 * @ordered
	 */
	protected Long errorFrames = ERROR_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDumpedFrames() <em>Dumped Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDumpedFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long DUMPED_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDumpedFrames() <em>Dumped Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDumpedFrames()
	 * @generated
	 * @ordered
	 */
	protected Long dumpedFrames = DUMPED_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkFailures() <em>Link Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long LINK_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkFailures() <em>Link Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkFailures()
	 * @generated
	 * @ordered
	 */
	protected Long linkFailures = LINK_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLossOfSignalCounter() <em>Loss Of Signal Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossOfSignalCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOSS_OF_SIGNAL_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLossOfSignalCounter() <em>Loss Of Signal Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossOfSignalCounter()
	 * @generated
	 * @ordered
	 */
	protected Long lossOfSignalCounter = LOSS_OF_SIGNAL_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLossOfSyncCounter() <em>Loss Of Sync Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossOfSyncCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOSS_OF_SYNC_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLossOfSyncCounter() <em>Loss Of Sync Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossOfSyncCounter()
	 * @generated
	 * @ordered
	 */
	protected Long lossOfSyncCounter = LOSS_OF_SYNC_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimitiveSeqProtocolErrCount() <em>Primitive Seq Protocol Err Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveSeqProtocolErrCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRIMITIVE_SEQ_PROTOCOL_ERR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimitiveSeqProtocolErrCount() <em>Primitive Seq Protocol Err Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveSeqProtocolErrCount()
	 * @generated
	 * @ordered
	 */
	protected Long primitiveSeqProtocolErrCount = PRIMITIVE_SEQ_PROTOCOL_ERR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCRCErrors() <em>CRC Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRCErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long CRC_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCRCErrors() <em>CRC Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRCErrors()
	 * @generated
	 * @ordered
	 */
	protected Long crcErrors = CRC_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvalidTransmissionWords() <em>Invalid Transmission Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidTransmissionWords()
	 * @generated
	 * @ordered
	 */
	protected static final Long INVALID_TRANSMISSION_WORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvalidTransmissionWords() <em>Invalid Transmission Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidTransmissionWords()
	 * @generated
	 * @ordered
	 */
	protected Long invalidTransmissionWords = INVALID_TRANSMISSION_WORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFramesTooShort() <em>Frames Too Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesTooShort()
	 * @generated
	 * @ordered
	 */
	protected static final Long FRAMES_TOO_SHORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramesTooShort() <em>Frames Too Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesTooShort()
	 * @generated
	 * @ordered
	 */
	protected Long framesTooShort = FRAMES_TOO_SHORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFramesTooLong() <em>Frames Too Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesTooLong()
	 * @generated
	 * @ordered
	 */
	protected static final Long FRAMES_TOO_LONG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramesTooLong() <em>Frames Too Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesTooLong()
	 * @generated
	 * @ordered
	 */
	protected Long framesTooLong = FRAMES_TOO_LONG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressErrors() <em>Address Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long ADDRESS_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressErrors() <em>Address Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressErrors()
	 * @generated
	 * @ordered
	 */
	protected Long addressErrors = ADDRESS_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferCreditNotProvided() <em>Buffer Credit Not Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferCreditNotProvided()
	 * @generated
	 * @ordered
	 */
	protected static final Long BUFFER_CREDIT_NOT_PROVIDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferCreditNotProvided() <em>Buffer Credit Not Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferCreditNotProvided()
	 * @generated
	 * @ordered
	 */
	protected Long bufferCreditNotProvided = BUFFER_CREDIT_NOT_PROVIDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferCreditNotReceived() <em>Buffer Credit Not Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferCreditNotReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long BUFFER_CREDIT_NOT_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferCreditNotReceived() <em>Buffer Credit Not Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferCreditNotReceived()
	 * @generated
	 * @ordered
	 */
	protected Long bufferCreditNotReceived = BUFFER_CREDIT_NOT_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelimiterErrors() <em>Delimiter Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiterErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long DELIMITER_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelimiterErrors() <em>Delimiter Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiterErrors()
	 * @generated
	 * @ordered
	 */
	protected Long delimiterErrors = DELIMITER_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncodingDisparityErrors() <em>Encoding Disparity Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodingDisparityErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long ENCODING_DISPARITY_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncodingDisparityErrors() <em>Encoding Disparity Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodingDisparityErrors()
	 * @generated
	 * @ordered
	 */
	protected Long encodingDisparityErrors = ENCODING_DISPARITY_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkResetsReceived() <em>Link Resets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkResetsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long LINK_RESETS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkResetsReceived() <em>Link Resets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkResetsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long linkResetsReceived = LINK_RESETS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkResetsTransmitted() <em>Link Resets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkResetsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Long LINK_RESETS_TRANSMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkResetsTransmitted() <em>Link Resets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkResetsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected Long linkResetsTransmitted = LINK_RESETS_TRANSMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMulticastFramesReceived() <em>Multicast Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticastFramesReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long MULTICAST_FRAMES_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMulticastFramesReceived() <em>Multicast Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticastFramesReceived()
	 * @generated
	 * @ordered
	 */
	protected Long multicastFramesReceived = MULTICAST_FRAMES_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMulticastFramesTransmitted() <em>Multicast Frames Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticastFramesTransmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Long MULTICAST_FRAMES_TRANSMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMulticastFramesTransmitted() <em>Multicast Frames Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticastFramesTransmitted()
	 * @generated
	 * @ordered
	 */
	protected Long multicastFramesTransmitted = MULTICAST_FRAMES_TRANSMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFBSYFrames() <em>FBSY Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFBSYFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long FBSY_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFBSYFrames() <em>FBSY Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFBSYFrames()
	 * @generated
	 * @ordered
	 */
	protected Long fbsyFrames = FBSY_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPBSYFrames() <em>PBSY Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPBSYFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long PBSY_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPBSYFrames() <em>PBSY Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPBSYFrames()
	 * @generated
	 * @ordered
	 */
	protected Long pbsyFrames = PBSY_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFRJTFrames() <em>FRJT Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRJTFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long FRJT_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFRJTFrames() <em>FRJT Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRJTFrames()
	 * @generated
	 * @ordered
	 */
	protected Long frjtFrames = FRJT_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPRJTFrames() <em>PRJT Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRJTFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRJT_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPRJTFrames() <em>PRJT Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRJTFrames()
	 * @generated
	 * @ordered
	 */
	protected Long prjtFrames = PRJT_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRXClass1Frames() <em>RX Class1 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXClass1Frames()
	 * @generated
	 * @ordered
	 */
	protected static final Long RX_CLASS1_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRXClass1Frames() <em>RX Class1 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXClass1Frames()
	 * @generated
	 * @ordered
	 */
	protected Long rxClass1Frames = RX_CLASS1_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTXClass1Frames() <em>TX Class1 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXClass1Frames()
	 * @generated
	 * @ordered
	 */
	protected static final Long TX_CLASS1_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTXClass1Frames() <em>TX Class1 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXClass1Frames()
	 * @generated
	 * @ordered
	 */
	protected Long txClass1Frames = TX_CLASS1_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass1FBSY() <em>Class1 FBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1FBSY()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS1_FBSY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass1FBSY() <em>Class1 FBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1FBSY()
	 * @generated
	 * @ordered
	 */
	protected Long class1FBSY = CLASS1_FBSY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass1PBSY() <em>Class1 PBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1PBSY()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS1_PBSY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass1PBSY() <em>Class1 PBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1PBSY()
	 * @generated
	 * @ordered
	 */
	protected Long class1PBSY = CLASS1_PBSY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass1FRJT() <em>Class1 FRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1FRJT()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS1_FRJT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass1FRJT() <em>Class1 FRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1FRJT()
	 * @generated
	 * @ordered
	 */
	protected Long class1FRJT = CLASS1_FRJT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass1PRJT() <em>Class1 PRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1PRJT()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS1_PRJT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass1PRJT() <em>Class1 PRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1PRJT()
	 * @generated
	 * @ordered
	 */
	protected Long class1PRJT = CLASS1_PRJT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRXClass2Frames() <em>RX Class2 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXClass2Frames()
	 * @generated
	 * @ordered
	 */
	protected static final Long RX_CLASS2_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRXClass2Frames() <em>RX Class2 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXClass2Frames()
	 * @generated
	 * @ordered
	 */
	protected Long rxClass2Frames = RX_CLASS2_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTXClass2Frames() <em>TX Class2 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXClass2Frames()
	 * @generated
	 * @ordered
	 */
	protected static final Long TX_CLASS2_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTXClass2Frames() <em>TX Class2 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXClass2Frames()
	 * @generated
	 * @ordered
	 */
	protected Long txClass2Frames = TX_CLASS2_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass2FBSY() <em>Class2 FBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2FBSY()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS2_FBSY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass2FBSY() <em>Class2 FBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2FBSY()
	 * @generated
	 * @ordered
	 */
	protected Long class2FBSY = CLASS2_FBSY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass2PBSY() <em>Class2 PBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2PBSY()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS2_PBSY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass2PBSY() <em>Class2 PBSY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2PBSY()
	 * @generated
	 * @ordered
	 */
	protected Long class2PBSY = CLASS2_PBSY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass2FRJT() <em>Class2 FRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2FRJT()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS2_FRJT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass2FRJT() <em>Class2 FRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2FRJT()
	 * @generated
	 * @ordered
	 */
	protected Long class2FRJT = CLASS2_FRJT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass2PRJT() <em>Class2 PRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2PRJT()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS2_PRJT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass2PRJT() <em>Class2 PRJT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2PRJT()
	 * @generated
	 * @ordered
	 */
	protected Long class2PRJT = CLASS2_PRJT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRXClass3Frames() <em>RX Class3 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXClass3Frames()
	 * @generated
	 * @ordered
	 */
	protected static final Long RX_CLASS3_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRXClass3Frames() <em>RX Class3 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXClass3Frames()
	 * @generated
	 * @ordered
	 */
	protected Long rxClass3Frames = RX_CLASS3_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTXClass3Frames() <em>TX Class3 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXClass3Frames()
	 * @generated
	 * @ordered
	 */
	protected static final Long TX_CLASS3_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTXClass3Frames() <em>TX Class3 Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXClass3Frames()
	 * @generated
	 * @ordered
	 */
	protected Long txClass3Frames = TX_CLASS3_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass3FramesDiscarded() <em>Class3 Frames Discarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3FramesDiscarded()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS3_FRAMES_DISCARDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass3FramesDiscarded() <em>Class3 Frames Discarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3FramesDiscarded()
	 * @generated
	 * @ordered
	 */
	protected Long class3FramesDiscarded = CLASS3_FRAMES_DISCARDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRXBroadcastFrames() <em>RX Broadcast Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXBroadcastFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long RX_BROADCAST_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRXBroadcastFrames() <em>RX Broadcast Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXBroadcastFrames()
	 * @generated
	 * @ordered
	 */
	protected Long rxBroadcastFrames = RX_BROADCAST_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTXBroadcastFrames() <em>TX Broadcast Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXBroadcastFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long TX_BROADCAST_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTXBroadcastFrames() <em>TX Broadcast Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXBroadcastFrames()
	 * @generated
	 * @ordered
	 */
	protected Long txBroadcastFrames = TX_BROADCAST_FRAMES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FCPortStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FCPortStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLIPCount() {
		return lipCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLIPCount(Long newLIPCount) {
		Long oldLIPCount = lipCount;
		lipCount = newLIPCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__LIP_COUNT, oldLIPCount, lipCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNOSCount() {
		return nosCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNOSCount(Long newNOSCount) {
		Long oldNOSCount = nosCount;
		nosCount = newNOSCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__NOS_COUNT, oldNOSCount, nosCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getErrorFrames() {
		return errorFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorFrames(Long newErrorFrames) {
		Long oldErrorFrames = errorFrames;
		errorFrames = newErrorFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__ERROR_FRAMES, oldErrorFrames, errorFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDumpedFrames() {
		return dumpedFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDumpedFrames(Long newDumpedFrames) {
		Long oldDumpedFrames = dumpedFrames;
		dumpedFrames = newDumpedFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__DUMPED_FRAMES, oldDumpedFrames, dumpedFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLinkFailures() {
		return linkFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkFailures(Long newLinkFailures) {
		Long oldLinkFailures = linkFailures;
		linkFailures = newLinkFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__LINK_FAILURES, oldLinkFailures, linkFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLossOfSignalCounter() {
		return lossOfSignalCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLossOfSignalCounter(Long newLossOfSignalCounter) {
		Long oldLossOfSignalCounter = lossOfSignalCounter;
		lossOfSignalCounter = newLossOfSignalCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__LOSS_OF_SIGNAL_COUNTER, oldLossOfSignalCounter, lossOfSignalCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLossOfSyncCounter() {
		return lossOfSyncCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLossOfSyncCounter(Long newLossOfSyncCounter) {
		Long oldLossOfSyncCounter = lossOfSyncCounter;
		lossOfSyncCounter = newLossOfSyncCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__LOSS_OF_SYNC_COUNTER, oldLossOfSyncCounter, lossOfSyncCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPrimitiveSeqProtocolErrCount() {
		return primitiveSeqProtocolErrCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimitiveSeqProtocolErrCount(Long newPrimitiveSeqProtocolErrCount) {
		Long oldPrimitiveSeqProtocolErrCount = primitiveSeqProtocolErrCount;
		primitiveSeqProtocolErrCount = newPrimitiveSeqProtocolErrCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__PRIMITIVE_SEQ_PROTOCOL_ERR_COUNT, oldPrimitiveSeqProtocolErrCount, primitiveSeqProtocolErrCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCRCErrors() {
		return crcErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCRCErrors(Long newCRCErrors) {
		Long oldCRCErrors = crcErrors;
		crcErrors = newCRCErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__CRC_ERRORS, oldCRCErrors, crcErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInvalidTransmissionWords() {
		return invalidTransmissionWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvalidTransmissionWords(Long newInvalidTransmissionWords) {
		Long oldInvalidTransmissionWords = invalidTransmissionWords;
		invalidTransmissionWords = newInvalidTransmissionWords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__INVALID_TRANSMISSION_WORDS, oldInvalidTransmissionWords, invalidTransmissionWords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFramesTooShort() {
		return framesTooShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFramesTooShort(Long newFramesTooShort) {
		Long oldFramesTooShort = framesTooShort;
		framesTooShort = newFramesTooShort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__FRAMES_TOO_SHORT, oldFramesTooShort, framesTooShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFramesTooLong() {
		return framesTooLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFramesTooLong(Long newFramesTooLong) {
		Long oldFramesTooLong = framesTooLong;
		framesTooLong = newFramesTooLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__FRAMES_TOO_LONG, oldFramesTooLong, framesTooLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAddressErrors() {
		return addressErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressErrors(Long newAddressErrors) {
		Long oldAddressErrors = addressErrors;
		addressErrors = newAddressErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__ADDRESS_ERRORS, oldAddressErrors, addressErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBufferCreditNotProvided() {
		return bufferCreditNotProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBufferCreditNotProvided(Long newBufferCreditNotProvided) {
		Long oldBufferCreditNotProvided = bufferCreditNotProvided;
		bufferCreditNotProvided = newBufferCreditNotProvided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__BUFFER_CREDIT_NOT_PROVIDED, oldBufferCreditNotProvided, bufferCreditNotProvided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBufferCreditNotReceived() {
		return bufferCreditNotReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBufferCreditNotReceived(Long newBufferCreditNotReceived) {
		Long oldBufferCreditNotReceived = bufferCreditNotReceived;
		bufferCreditNotReceived = newBufferCreditNotReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__BUFFER_CREDIT_NOT_RECEIVED, oldBufferCreditNotReceived, bufferCreditNotReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDelimiterErrors() {
		return delimiterErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimiterErrors(Long newDelimiterErrors) {
		Long oldDelimiterErrors = delimiterErrors;
		delimiterErrors = newDelimiterErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__DELIMITER_ERRORS, oldDelimiterErrors, delimiterErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEncodingDisparityErrors() {
		return encodingDisparityErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncodingDisparityErrors(Long newEncodingDisparityErrors) {
		Long oldEncodingDisparityErrors = encodingDisparityErrors;
		encodingDisparityErrors = newEncodingDisparityErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__ENCODING_DISPARITY_ERRORS, oldEncodingDisparityErrors, encodingDisparityErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLinkResetsReceived() {
		return linkResetsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkResetsReceived(Long newLinkResetsReceived) {
		Long oldLinkResetsReceived = linkResetsReceived;
		linkResetsReceived = newLinkResetsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__LINK_RESETS_RECEIVED, oldLinkResetsReceived, linkResetsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLinkResetsTransmitted() {
		return linkResetsTransmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkResetsTransmitted(Long newLinkResetsTransmitted) {
		Long oldLinkResetsTransmitted = linkResetsTransmitted;
		linkResetsTransmitted = newLinkResetsTransmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__LINK_RESETS_TRANSMITTED, oldLinkResetsTransmitted, linkResetsTransmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMulticastFramesReceived() {
		return multicastFramesReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMulticastFramesReceived(Long newMulticastFramesReceived) {
		Long oldMulticastFramesReceived = multicastFramesReceived;
		multicastFramesReceived = newMulticastFramesReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__MULTICAST_FRAMES_RECEIVED, oldMulticastFramesReceived, multicastFramesReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMulticastFramesTransmitted() {
		return multicastFramesTransmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMulticastFramesTransmitted(Long newMulticastFramesTransmitted) {
		Long oldMulticastFramesTransmitted = multicastFramesTransmitted;
		multicastFramesTransmitted = newMulticastFramesTransmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__MULTICAST_FRAMES_TRANSMITTED, oldMulticastFramesTransmitted, multicastFramesTransmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFBSYFrames() {
		return fbsyFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFBSYFrames(Long newFBSYFrames) {
		Long oldFBSYFrames = fbsyFrames;
		fbsyFrames = newFBSYFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__FBSY_FRAMES, oldFBSYFrames, fbsyFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPBSYFrames() {
		return pbsyFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPBSYFrames(Long newPBSYFrames) {
		Long oldPBSYFrames = pbsyFrames;
		pbsyFrames = newPBSYFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__PBSY_FRAMES, oldPBSYFrames, pbsyFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFRJTFrames() {
		return frjtFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFRJTFrames(Long newFRJTFrames) {
		Long oldFRJTFrames = frjtFrames;
		frjtFrames = newFRJTFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__FRJT_FRAMES, oldFRJTFrames, frjtFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPRJTFrames() {
		return prjtFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPRJTFrames(Long newPRJTFrames) {
		Long oldPRJTFrames = prjtFrames;
		prjtFrames = newPRJTFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__PRJT_FRAMES, oldPRJTFrames, prjtFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRXClass1Frames() {
		return rxClass1Frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRXClass1Frames(Long newRXClass1Frames) {
		Long oldRXClass1Frames = rxClass1Frames;
		rxClass1Frames = newRXClass1Frames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS1_FRAMES, oldRXClass1Frames, rxClass1Frames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTXClass1Frames() {
		return txClass1Frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTXClass1Frames(Long newTXClass1Frames) {
		Long oldTXClass1Frames = txClass1Frames;
		txClass1Frames = newTXClass1Frames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS1_FRAMES, oldTXClass1Frames, txClass1Frames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass1FBSY() {
		return class1FBSY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass1FBSY(Long newClass1FBSY) {
		Long oldClass1FBSY = class1FBSY;
		class1FBSY = newClass1FBSY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_FBSY, oldClass1FBSY, class1FBSY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass1PBSY() {
		return class1PBSY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass1PBSY(Long newClass1PBSY) {
		Long oldClass1PBSY = class1PBSY;
		class1PBSY = newClass1PBSY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_PBSY, oldClass1PBSY, class1PBSY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass1FRJT() {
		return class1FRJT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass1FRJT(Long newClass1FRJT) {
		Long oldClass1FRJT = class1FRJT;
		class1FRJT = newClass1FRJT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_FRJT, oldClass1FRJT, class1FRJT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass1PRJT() {
		return class1PRJT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass1PRJT(Long newClass1PRJT) {
		Long oldClass1PRJT = class1PRJT;
		class1PRJT = newClass1PRJT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_PRJT, oldClass1PRJT, class1PRJT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRXClass2Frames() {
		return rxClass2Frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRXClass2Frames(Long newRXClass2Frames) {
		Long oldRXClass2Frames = rxClass2Frames;
		rxClass2Frames = newRXClass2Frames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS2_FRAMES, oldRXClass2Frames, rxClass2Frames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTXClass2Frames() {
		return txClass2Frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTXClass2Frames(Long newTXClass2Frames) {
		Long oldTXClass2Frames = txClass2Frames;
		txClass2Frames = newTXClass2Frames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS2_FRAMES, oldTXClass2Frames, txClass2Frames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass2FBSY() {
		return class2FBSY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass2FBSY(Long newClass2FBSY) {
		Long oldClass2FBSY = class2FBSY;
		class2FBSY = newClass2FBSY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_FBSY, oldClass2FBSY, class2FBSY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass2PBSY() {
		return class2PBSY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass2PBSY(Long newClass2PBSY) {
		Long oldClass2PBSY = class2PBSY;
		class2PBSY = newClass2PBSY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_PBSY, oldClass2PBSY, class2PBSY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass2FRJT() {
		return class2FRJT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass2FRJT(Long newClass2FRJT) {
		Long oldClass2FRJT = class2FRJT;
		class2FRJT = newClass2FRJT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_FRJT, oldClass2FRJT, class2FRJT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass2PRJT() {
		return class2PRJT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass2PRJT(Long newClass2PRJT) {
		Long oldClass2PRJT = class2PRJT;
		class2PRJT = newClass2PRJT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_PRJT, oldClass2PRJT, class2PRJT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRXClass3Frames() {
		return rxClass3Frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRXClass3Frames(Long newRXClass3Frames) {
		Long oldRXClass3Frames = rxClass3Frames;
		rxClass3Frames = newRXClass3Frames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS3_FRAMES, oldRXClass3Frames, rxClass3Frames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTXClass3Frames() {
		return txClass3Frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTXClass3Frames(Long newTXClass3Frames) {
		Long oldTXClass3Frames = txClass3Frames;
		txClass3Frames = newTXClass3Frames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS3_FRAMES, oldTXClass3Frames, txClass3Frames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass3FramesDiscarded() {
		return class3FramesDiscarded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass3FramesDiscarded(Long newClass3FramesDiscarded) {
		Long oldClass3FramesDiscarded = class3FramesDiscarded;
		class3FramesDiscarded = newClass3FramesDiscarded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__CLASS3_FRAMES_DISCARDED, oldClass3FramesDiscarded, class3FramesDiscarded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRXBroadcastFrames() {
		return rxBroadcastFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRXBroadcastFrames(Long newRXBroadcastFrames) {
		Long oldRXBroadcastFrames = rxBroadcastFrames;
		rxBroadcastFrames = newRXBroadcastFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__RX_BROADCAST_FRAMES, oldRXBroadcastFrames, rxBroadcastFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTXBroadcastFrames() {
		return txBroadcastFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTXBroadcastFrames(Long newTXBroadcastFrames) {
		Long oldTXBroadcastFrames = txBroadcastFrames;
		txBroadcastFrames = newTXBroadcastFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_STATISTICS__TX_BROADCAST_FRAMES, oldTXBroadcastFrames, txBroadcastFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FC_PORT_STATISTICS__LIP_COUNT:
				return getLIPCount();
			case CimPackage.CIM_FC_PORT_STATISTICS__NOS_COUNT:
				return getNOSCount();
			case CimPackage.CIM_FC_PORT_STATISTICS__ERROR_FRAMES:
				return getErrorFrames();
			case CimPackage.CIM_FC_PORT_STATISTICS__DUMPED_FRAMES:
				return getDumpedFrames();
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_FAILURES:
				return getLinkFailures();
			case CimPackage.CIM_FC_PORT_STATISTICS__LOSS_OF_SIGNAL_COUNTER:
				return getLossOfSignalCounter();
			case CimPackage.CIM_FC_PORT_STATISTICS__LOSS_OF_SYNC_COUNTER:
				return getLossOfSyncCounter();
			case CimPackage.CIM_FC_PORT_STATISTICS__PRIMITIVE_SEQ_PROTOCOL_ERR_COUNT:
				return getPrimitiveSeqProtocolErrCount();
			case CimPackage.CIM_FC_PORT_STATISTICS__CRC_ERRORS:
				return getCRCErrors();
			case CimPackage.CIM_FC_PORT_STATISTICS__INVALID_TRANSMISSION_WORDS:
				return getInvalidTransmissionWords();
			case CimPackage.CIM_FC_PORT_STATISTICS__FRAMES_TOO_SHORT:
				return getFramesTooShort();
			case CimPackage.CIM_FC_PORT_STATISTICS__FRAMES_TOO_LONG:
				return getFramesTooLong();
			case CimPackage.CIM_FC_PORT_STATISTICS__ADDRESS_ERRORS:
				return getAddressErrors();
			case CimPackage.CIM_FC_PORT_STATISTICS__BUFFER_CREDIT_NOT_PROVIDED:
				return getBufferCreditNotProvided();
			case CimPackage.CIM_FC_PORT_STATISTICS__BUFFER_CREDIT_NOT_RECEIVED:
				return getBufferCreditNotReceived();
			case CimPackage.CIM_FC_PORT_STATISTICS__DELIMITER_ERRORS:
				return getDelimiterErrors();
			case CimPackage.CIM_FC_PORT_STATISTICS__ENCODING_DISPARITY_ERRORS:
				return getEncodingDisparityErrors();
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_RESETS_RECEIVED:
				return getLinkResetsReceived();
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_RESETS_TRANSMITTED:
				return getLinkResetsTransmitted();
			case CimPackage.CIM_FC_PORT_STATISTICS__MULTICAST_FRAMES_RECEIVED:
				return getMulticastFramesReceived();
			case CimPackage.CIM_FC_PORT_STATISTICS__MULTICAST_FRAMES_TRANSMITTED:
				return getMulticastFramesTransmitted();
			case CimPackage.CIM_FC_PORT_STATISTICS__FBSY_FRAMES:
				return getFBSYFrames();
			case CimPackage.CIM_FC_PORT_STATISTICS__PBSY_FRAMES:
				return getPBSYFrames();
			case CimPackage.CIM_FC_PORT_STATISTICS__FRJT_FRAMES:
				return getFRJTFrames();
			case CimPackage.CIM_FC_PORT_STATISTICS__PRJT_FRAMES:
				return getPRJTFrames();
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS1_FRAMES:
				return getRXClass1Frames();
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS1_FRAMES:
				return getTXClass1Frames();
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_FBSY:
				return getClass1FBSY();
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_PBSY:
				return getClass1PBSY();
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_FRJT:
				return getClass1FRJT();
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_PRJT:
				return getClass1PRJT();
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS2_FRAMES:
				return getRXClass2Frames();
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS2_FRAMES:
				return getTXClass2Frames();
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_FBSY:
				return getClass2FBSY();
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_PBSY:
				return getClass2PBSY();
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_FRJT:
				return getClass2FRJT();
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_PRJT:
				return getClass2PRJT();
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS3_FRAMES:
				return getRXClass3Frames();
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS3_FRAMES:
				return getTXClass3Frames();
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS3_FRAMES_DISCARDED:
				return getClass3FramesDiscarded();
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_BROADCAST_FRAMES:
				return getRXBroadcastFrames();
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_BROADCAST_FRAMES:
				return getTXBroadcastFrames();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_FC_PORT_STATISTICS__LIP_COUNT:
				setLIPCount((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__NOS_COUNT:
				setNOSCount((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__ERROR_FRAMES:
				setErrorFrames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__DUMPED_FRAMES:
				setDumpedFrames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_FAILURES:
				setLinkFailures((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__LOSS_OF_SIGNAL_COUNTER:
				setLossOfSignalCounter((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__LOSS_OF_SYNC_COUNTER:
				setLossOfSyncCounter((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__PRIMITIVE_SEQ_PROTOCOL_ERR_COUNT:
				setPrimitiveSeqProtocolErrCount((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CRC_ERRORS:
				setCRCErrors((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__INVALID_TRANSMISSION_WORDS:
				setInvalidTransmissionWords((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__FRAMES_TOO_SHORT:
				setFramesTooShort((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__FRAMES_TOO_LONG:
				setFramesTooLong((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__ADDRESS_ERRORS:
				setAddressErrors((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__BUFFER_CREDIT_NOT_PROVIDED:
				setBufferCreditNotProvided((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__BUFFER_CREDIT_NOT_RECEIVED:
				setBufferCreditNotReceived((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__DELIMITER_ERRORS:
				setDelimiterErrors((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__ENCODING_DISPARITY_ERRORS:
				setEncodingDisparityErrors((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_RESETS_RECEIVED:
				setLinkResetsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_RESETS_TRANSMITTED:
				setLinkResetsTransmitted((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__MULTICAST_FRAMES_RECEIVED:
				setMulticastFramesReceived((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__MULTICAST_FRAMES_TRANSMITTED:
				setMulticastFramesTransmitted((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__FBSY_FRAMES:
				setFBSYFrames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__PBSY_FRAMES:
				setPBSYFrames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__FRJT_FRAMES:
				setFRJTFrames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__PRJT_FRAMES:
				setPRJTFrames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS1_FRAMES:
				setRXClass1Frames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS1_FRAMES:
				setTXClass1Frames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_FBSY:
				setClass1FBSY((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_PBSY:
				setClass1PBSY((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_FRJT:
				setClass1FRJT((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_PRJT:
				setClass1PRJT((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS2_FRAMES:
				setRXClass2Frames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS2_FRAMES:
				setTXClass2Frames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_FBSY:
				setClass2FBSY((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_PBSY:
				setClass2PBSY((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_FRJT:
				setClass2FRJT((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_PRJT:
				setClass2PRJT((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS3_FRAMES:
				setRXClass3Frames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS3_FRAMES:
				setTXClass3Frames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS3_FRAMES_DISCARDED:
				setClass3FramesDiscarded((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_BROADCAST_FRAMES:
				setRXBroadcastFrames((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_BROADCAST_FRAMES:
				setTXBroadcastFrames((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_FC_PORT_STATISTICS__LIP_COUNT:
				setLIPCount(LIP_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__NOS_COUNT:
				setNOSCount(NOS_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__ERROR_FRAMES:
				setErrorFrames(ERROR_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__DUMPED_FRAMES:
				setDumpedFrames(DUMPED_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_FAILURES:
				setLinkFailures(LINK_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__LOSS_OF_SIGNAL_COUNTER:
				setLossOfSignalCounter(LOSS_OF_SIGNAL_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__LOSS_OF_SYNC_COUNTER:
				setLossOfSyncCounter(LOSS_OF_SYNC_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__PRIMITIVE_SEQ_PROTOCOL_ERR_COUNT:
				setPrimitiveSeqProtocolErrCount(PRIMITIVE_SEQ_PROTOCOL_ERR_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CRC_ERRORS:
				setCRCErrors(CRC_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__INVALID_TRANSMISSION_WORDS:
				setInvalidTransmissionWords(INVALID_TRANSMISSION_WORDS_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__FRAMES_TOO_SHORT:
				setFramesTooShort(FRAMES_TOO_SHORT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__FRAMES_TOO_LONG:
				setFramesTooLong(FRAMES_TOO_LONG_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__ADDRESS_ERRORS:
				setAddressErrors(ADDRESS_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__BUFFER_CREDIT_NOT_PROVIDED:
				setBufferCreditNotProvided(BUFFER_CREDIT_NOT_PROVIDED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__BUFFER_CREDIT_NOT_RECEIVED:
				setBufferCreditNotReceived(BUFFER_CREDIT_NOT_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__DELIMITER_ERRORS:
				setDelimiterErrors(DELIMITER_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__ENCODING_DISPARITY_ERRORS:
				setEncodingDisparityErrors(ENCODING_DISPARITY_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_RESETS_RECEIVED:
				setLinkResetsReceived(LINK_RESETS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_RESETS_TRANSMITTED:
				setLinkResetsTransmitted(LINK_RESETS_TRANSMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__MULTICAST_FRAMES_RECEIVED:
				setMulticastFramesReceived(MULTICAST_FRAMES_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__MULTICAST_FRAMES_TRANSMITTED:
				setMulticastFramesTransmitted(MULTICAST_FRAMES_TRANSMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__FBSY_FRAMES:
				setFBSYFrames(FBSY_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__PBSY_FRAMES:
				setPBSYFrames(PBSY_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__FRJT_FRAMES:
				setFRJTFrames(FRJT_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__PRJT_FRAMES:
				setPRJTFrames(PRJT_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS1_FRAMES:
				setRXClass1Frames(RX_CLASS1_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS1_FRAMES:
				setTXClass1Frames(TX_CLASS1_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_FBSY:
				setClass1FBSY(CLASS1_FBSY_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_PBSY:
				setClass1PBSY(CLASS1_PBSY_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_FRJT:
				setClass1FRJT(CLASS1_FRJT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_PRJT:
				setClass1PRJT(CLASS1_PRJT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS2_FRAMES:
				setRXClass2Frames(RX_CLASS2_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS2_FRAMES:
				setTXClass2Frames(TX_CLASS2_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_FBSY:
				setClass2FBSY(CLASS2_FBSY_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_PBSY:
				setClass2PBSY(CLASS2_PBSY_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_FRJT:
				setClass2FRJT(CLASS2_FRJT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_PRJT:
				setClass2PRJT(CLASS2_PRJT_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS3_FRAMES:
				setRXClass3Frames(RX_CLASS3_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS3_FRAMES:
				setTXClass3Frames(TX_CLASS3_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS3_FRAMES_DISCARDED:
				setClass3FramesDiscarded(CLASS3_FRAMES_DISCARDED_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_BROADCAST_FRAMES:
				setRXBroadcastFrames(RX_BROADCAST_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_BROADCAST_FRAMES:
				setTXBroadcastFrames(TX_BROADCAST_FRAMES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_FC_PORT_STATISTICS__LIP_COUNT:
				return LIP_COUNT_EDEFAULT == null ? lipCount != null : !LIP_COUNT_EDEFAULT.equals(lipCount);
			case CimPackage.CIM_FC_PORT_STATISTICS__NOS_COUNT:
				return NOS_COUNT_EDEFAULT == null ? nosCount != null : !NOS_COUNT_EDEFAULT.equals(nosCount);
			case CimPackage.CIM_FC_PORT_STATISTICS__ERROR_FRAMES:
				return ERROR_FRAMES_EDEFAULT == null ? errorFrames != null : !ERROR_FRAMES_EDEFAULT.equals(errorFrames);
			case CimPackage.CIM_FC_PORT_STATISTICS__DUMPED_FRAMES:
				return DUMPED_FRAMES_EDEFAULT == null ? dumpedFrames != null : !DUMPED_FRAMES_EDEFAULT.equals(dumpedFrames);
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_FAILURES:
				return LINK_FAILURES_EDEFAULT == null ? linkFailures != null : !LINK_FAILURES_EDEFAULT.equals(linkFailures);
			case CimPackage.CIM_FC_PORT_STATISTICS__LOSS_OF_SIGNAL_COUNTER:
				return LOSS_OF_SIGNAL_COUNTER_EDEFAULT == null ? lossOfSignalCounter != null : !LOSS_OF_SIGNAL_COUNTER_EDEFAULT.equals(lossOfSignalCounter);
			case CimPackage.CIM_FC_PORT_STATISTICS__LOSS_OF_SYNC_COUNTER:
				return LOSS_OF_SYNC_COUNTER_EDEFAULT == null ? lossOfSyncCounter != null : !LOSS_OF_SYNC_COUNTER_EDEFAULT.equals(lossOfSyncCounter);
			case CimPackage.CIM_FC_PORT_STATISTICS__PRIMITIVE_SEQ_PROTOCOL_ERR_COUNT:
				return PRIMITIVE_SEQ_PROTOCOL_ERR_COUNT_EDEFAULT == null ? primitiveSeqProtocolErrCount != null : !PRIMITIVE_SEQ_PROTOCOL_ERR_COUNT_EDEFAULT.equals(primitiveSeqProtocolErrCount);
			case CimPackage.CIM_FC_PORT_STATISTICS__CRC_ERRORS:
				return CRC_ERRORS_EDEFAULT == null ? crcErrors != null : !CRC_ERRORS_EDEFAULT.equals(crcErrors);
			case CimPackage.CIM_FC_PORT_STATISTICS__INVALID_TRANSMISSION_WORDS:
				return INVALID_TRANSMISSION_WORDS_EDEFAULT == null ? invalidTransmissionWords != null : !INVALID_TRANSMISSION_WORDS_EDEFAULT.equals(invalidTransmissionWords);
			case CimPackage.CIM_FC_PORT_STATISTICS__FRAMES_TOO_SHORT:
				return FRAMES_TOO_SHORT_EDEFAULT == null ? framesTooShort != null : !FRAMES_TOO_SHORT_EDEFAULT.equals(framesTooShort);
			case CimPackage.CIM_FC_PORT_STATISTICS__FRAMES_TOO_LONG:
				return FRAMES_TOO_LONG_EDEFAULT == null ? framesTooLong != null : !FRAMES_TOO_LONG_EDEFAULT.equals(framesTooLong);
			case CimPackage.CIM_FC_PORT_STATISTICS__ADDRESS_ERRORS:
				return ADDRESS_ERRORS_EDEFAULT == null ? addressErrors != null : !ADDRESS_ERRORS_EDEFAULT.equals(addressErrors);
			case CimPackage.CIM_FC_PORT_STATISTICS__BUFFER_CREDIT_NOT_PROVIDED:
				return BUFFER_CREDIT_NOT_PROVIDED_EDEFAULT == null ? bufferCreditNotProvided != null : !BUFFER_CREDIT_NOT_PROVIDED_EDEFAULT.equals(bufferCreditNotProvided);
			case CimPackage.CIM_FC_PORT_STATISTICS__BUFFER_CREDIT_NOT_RECEIVED:
				return BUFFER_CREDIT_NOT_RECEIVED_EDEFAULT == null ? bufferCreditNotReceived != null : !BUFFER_CREDIT_NOT_RECEIVED_EDEFAULT.equals(bufferCreditNotReceived);
			case CimPackage.CIM_FC_PORT_STATISTICS__DELIMITER_ERRORS:
				return DELIMITER_ERRORS_EDEFAULT == null ? delimiterErrors != null : !DELIMITER_ERRORS_EDEFAULT.equals(delimiterErrors);
			case CimPackage.CIM_FC_PORT_STATISTICS__ENCODING_DISPARITY_ERRORS:
				return ENCODING_DISPARITY_ERRORS_EDEFAULT == null ? encodingDisparityErrors != null : !ENCODING_DISPARITY_ERRORS_EDEFAULT.equals(encodingDisparityErrors);
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_RESETS_RECEIVED:
				return LINK_RESETS_RECEIVED_EDEFAULT == null ? linkResetsReceived != null : !LINK_RESETS_RECEIVED_EDEFAULT.equals(linkResetsReceived);
			case CimPackage.CIM_FC_PORT_STATISTICS__LINK_RESETS_TRANSMITTED:
				return LINK_RESETS_TRANSMITTED_EDEFAULT == null ? linkResetsTransmitted != null : !LINK_RESETS_TRANSMITTED_EDEFAULT.equals(linkResetsTransmitted);
			case CimPackage.CIM_FC_PORT_STATISTICS__MULTICAST_FRAMES_RECEIVED:
				return MULTICAST_FRAMES_RECEIVED_EDEFAULT == null ? multicastFramesReceived != null : !MULTICAST_FRAMES_RECEIVED_EDEFAULT.equals(multicastFramesReceived);
			case CimPackage.CIM_FC_PORT_STATISTICS__MULTICAST_FRAMES_TRANSMITTED:
				return MULTICAST_FRAMES_TRANSMITTED_EDEFAULT == null ? multicastFramesTransmitted != null : !MULTICAST_FRAMES_TRANSMITTED_EDEFAULT.equals(multicastFramesTransmitted);
			case CimPackage.CIM_FC_PORT_STATISTICS__FBSY_FRAMES:
				return FBSY_FRAMES_EDEFAULT == null ? fbsyFrames != null : !FBSY_FRAMES_EDEFAULT.equals(fbsyFrames);
			case CimPackage.CIM_FC_PORT_STATISTICS__PBSY_FRAMES:
				return PBSY_FRAMES_EDEFAULT == null ? pbsyFrames != null : !PBSY_FRAMES_EDEFAULT.equals(pbsyFrames);
			case CimPackage.CIM_FC_PORT_STATISTICS__FRJT_FRAMES:
				return FRJT_FRAMES_EDEFAULT == null ? frjtFrames != null : !FRJT_FRAMES_EDEFAULT.equals(frjtFrames);
			case CimPackage.CIM_FC_PORT_STATISTICS__PRJT_FRAMES:
				return PRJT_FRAMES_EDEFAULT == null ? prjtFrames != null : !PRJT_FRAMES_EDEFAULT.equals(prjtFrames);
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS1_FRAMES:
				return RX_CLASS1_FRAMES_EDEFAULT == null ? rxClass1Frames != null : !RX_CLASS1_FRAMES_EDEFAULT.equals(rxClass1Frames);
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS1_FRAMES:
				return TX_CLASS1_FRAMES_EDEFAULT == null ? txClass1Frames != null : !TX_CLASS1_FRAMES_EDEFAULT.equals(txClass1Frames);
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_FBSY:
				return CLASS1_FBSY_EDEFAULT == null ? class1FBSY != null : !CLASS1_FBSY_EDEFAULT.equals(class1FBSY);
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_PBSY:
				return CLASS1_PBSY_EDEFAULT == null ? class1PBSY != null : !CLASS1_PBSY_EDEFAULT.equals(class1PBSY);
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_FRJT:
				return CLASS1_FRJT_EDEFAULT == null ? class1FRJT != null : !CLASS1_FRJT_EDEFAULT.equals(class1FRJT);
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS1_PRJT:
				return CLASS1_PRJT_EDEFAULT == null ? class1PRJT != null : !CLASS1_PRJT_EDEFAULT.equals(class1PRJT);
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS2_FRAMES:
				return RX_CLASS2_FRAMES_EDEFAULT == null ? rxClass2Frames != null : !RX_CLASS2_FRAMES_EDEFAULT.equals(rxClass2Frames);
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS2_FRAMES:
				return TX_CLASS2_FRAMES_EDEFAULT == null ? txClass2Frames != null : !TX_CLASS2_FRAMES_EDEFAULT.equals(txClass2Frames);
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_FBSY:
				return CLASS2_FBSY_EDEFAULT == null ? class2FBSY != null : !CLASS2_FBSY_EDEFAULT.equals(class2FBSY);
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_PBSY:
				return CLASS2_PBSY_EDEFAULT == null ? class2PBSY != null : !CLASS2_PBSY_EDEFAULT.equals(class2PBSY);
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_FRJT:
				return CLASS2_FRJT_EDEFAULT == null ? class2FRJT != null : !CLASS2_FRJT_EDEFAULT.equals(class2FRJT);
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS2_PRJT:
				return CLASS2_PRJT_EDEFAULT == null ? class2PRJT != null : !CLASS2_PRJT_EDEFAULT.equals(class2PRJT);
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_CLASS3_FRAMES:
				return RX_CLASS3_FRAMES_EDEFAULT == null ? rxClass3Frames != null : !RX_CLASS3_FRAMES_EDEFAULT.equals(rxClass3Frames);
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_CLASS3_FRAMES:
				return TX_CLASS3_FRAMES_EDEFAULT == null ? txClass3Frames != null : !TX_CLASS3_FRAMES_EDEFAULT.equals(txClass3Frames);
			case CimPackage.CIM_FC_PORT_STATISTICS__CLASS3_FRAMES_DISCARDED:
				return CLASS3_FRAMES_DISCARDED_EDEFAULT == null ? class3FramesDiscarded != null : !CLASS3_FRAMES_DISCARDED_EDEFAULT.equals(class3FramesDiscarded);
			case CimPackage.CIM_FC_PORT_STATISTICS__RX_BROADCAST_FRAMES:
				return RX_BROADCAST_FRAMES_EDEFAULT == null ? rxBroadcastFrames != null : !RX_BROADCAST_FRAMES_EDEFAULT.equals(rxBroadcastFrames);
			case CimPackage.CIM_FC_PORT_STATISTICS__TX_BROADCAST_FRAMES:
				return TX_BROADCAST_FRAMES_EDEFAULT == null ? txBroadcastFrames != null : !TX_BROADCAST_FRAMES_EDEFAULT.equals(txBroadcastFrames);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (LIPCount: ");
		result.append(lipCount);
		result.append(", NOSCount: ");
		result.append(nosCount);
		result.append(", ErrorFrames: ");
		result.append(errorFrames);
		result.append(", DumpedFrames: ");
		result.append(dumpedFrames);
		result.append(", LinkFailures: ");
		result.append(linkFailures);
		result.append(", LossOfSignalCounter: ");
		result.append(lossOfSignalCounter);
		result.append(", LossOfSyncCounter: ");
		result.append(lossOfSyncCounter);
		result.append(", PrimitiveSeqProtocolErrCount: ");
		result.append(primitiveSeqProtocolErrCount);
		result.append(", CRCErrors: ");
		result.append(crcErrors);
		result.append(", InvalidTransmissionWords: ");
		result.append(invalidTransmissionWords);
		result.append(", FramesTooShort: ");
		result.append(framesTooShort);
		result.append(", FramesTooLong: ");
		result.append(framesTooLong);
		result.append(", AddressErrors: ");
		result.append(addressErrors);
		result.append(", BufferCreditNotProvided: ");
		result.append(bufferCreditNotProvided);
		result.append(", BufferCreditNotReceived: ");
		result.append(bufferCreditNotReceived);
		result.append(", DelimiterErrors: ");
		result.append(delimiterErrors);
		result.append(", EncodingDisparityErrors: ");
		result.append(encodingDisparityErrors);
		result.append(", LinkResetsReceived: ");
		result.append(linkResetsReceived);
		result.append(", LinkResetsTransmitted: ");
		result.append(linkResetsTransmitted);
		result.append(", MulticastFramesReceived: ");
		result.append(multicastFramesReceived);
		result.append(", MulticastFramesTransmitted: ");
		result.append(multicastFramesTransmitted);
		result.append(", FBSYFrames: ");
		result.append(fbsyFrames);
		result.append(", PBSYFrames: ");
		result.append(pbsyFrames);
		result.append(", FRJTFrames: ");
		result.append(frjtFrames);
		result.append(", PRJTFrames: ");
		result.append(prjtFrames);
		result.append(", RXClass1Frames: ");
		result.append(rxClass1Frames);
		result.append(", TXClass1Frames: ");
		result.append(txClass1Frames);
		result.append(", Class1FBSY: ");
		result.append(class1FBSY);
		result.append(", Class1PBSY: ");
		result.append(class1PBSY);
		result.append(", Class1FRJT: ");
		result.append(class1FRJT);
		result.append(", Class1PRJT: ");
		result.append(class1PRJT);
		result.append(", RXClass2Frames: ");
		result.append(rxClass2Frames);
		result.append(", TXClass2Frames: ");
		result.append(txClass2Frames);
		result.append(", Class2FBSY: ");
		result.append(class2FBSY);
		result.append(", Class2PBSY: ");
		result.append(class2PBSY);
		result.append(", Class2FRJT: ");
		result.append(class2FRJT);
		result.append(", Class2PRJT: ");
		result.append(class2PRJT);
		result.append(", RXClass3Frames: ");
		result.append(rxClass3Frames);
		result.append(", TXClass3Frames: ");
		result.append(txClass3Frames);
		result.append(", Class3FramesDiscarded: ");
		result.append(class3FramesDiscarded);
		result.append(", RXBroadcastFrames: ");
		result.append(rxBroadcastFrames);
		result.append(", TXBroadcastFrames: ");
		result.append(txBroadcastFrames);
		result.append(')');
		return result.toString();
	}

} //CIM_FCPortStatisticsImpl
