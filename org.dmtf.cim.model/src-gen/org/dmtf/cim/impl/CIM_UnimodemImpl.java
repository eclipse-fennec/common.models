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

import org.dmtf.cim.CIM_Unimodem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unimodem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getCallSetupResultCode <em>Call Setup Result Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getMultiMediaMode <em>Multi Media Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getDTEDCEInterfaceMode <em>DTEDCE Interface Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getTransmitCarrierNegotiation <em>Transmit Carrier Negotiation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getReceiveCarrierNegotiation <em>Receive Carrier Negotiation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getInitialTransmitCarrierDataRate <em>Initial Transmit Carrier Data Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getInitialReceiveCarrierDataRate <em>Initial Receive Carrier Data Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getCarrierRetrainsRequested <em>Carrier Retrains Requested</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getCarrierRetrainsGranted <em>Carrier Retrains Granted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getFinalTransmitCarrierDataRate <em>Final Transmit Carrier Data Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getFinalReceiveCarrierDataRate <em>Final Receive Carrier Data Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getTerminationCause <em>Termination Cause</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getUnimodemRevision <em>Unimodem Revision</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getEstimatedNoiseLevel <em>Estimated Noise Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getNormalizedMeanSquaredError <em>Normalized Mean Squared Error</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getTemporaryCarrierLossEventCount <em>Temporary Carrier Loss Event Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getCarrierRenegotiationEventCount <em>Carrier Renegotiation Event Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getErrorControlFrameSize <em>Error Control Frame Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getErrorControlLinkTimeouts <em>Error Control Link Timeouts</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getErrorControlLinkNAKs <em>Error Control Link NA Ks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getTransmitFlowControl <em>Transmit Flow Control</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getReceiveFlowControl <em>Receive Flow Control</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getTransmitCharsSentFromDTE <em>Transmit Chars Sent From DTE</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getReceiveCharsSentToDTE <em>Receive Chars Sent To DTE</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getTransmitCharsLost <em>Transmit Chars Lost</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getReceiveCharsLost <em>Receive Chars Lost</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getTransmitIFrameCount <em>Transmit IFrame Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getReceiveIFrameCount <em>Receive IFrame Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getTransmitIFrameErrorCount <em>Transmit IFrame Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getReceivedIFrameErrorCount <em>Received IFrame Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnimodemImpl#getCallWaitingEventCount <em>Call Waiting Event Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnimodemImpl extends CIM_POTSModemImpl implements CIM_Unimodem {
	/**
	 * The default value of the '{@link #getCallSetupResultCode() <em>Call Setup Result Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallSetupResultCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CALL_SETUP_RESULT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallSetupResultCode() <em>Call Setup Result Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallSetupResultCode()
	 * @generated
	 * @ordered
	 */
	protected Integer callSetupResultCode = CALL_SETUP_RESULT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiMediaMode() <em>Multi Media Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiMediaMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MULTI_MEDIA_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiMediaMode() <em>Multi Media Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiMediaMode()
	 * @generated
	 * @ordered
	 */
	protected Integer multiMediaMode = MULTI_MEDIA_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDTEDCEInterfaceMode() <em>DTEDCE Interface Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTEDCEInterfaceMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DTEDCE_INTERFACE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDTEDCEInterfaceMode() <em>DTEDCE Interface Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTEDCEInterfaceMode()
	 * @generated
	 * @ordered
	 */
	protected Integer dtedceInterfaceMode = DTEDCE_INTERFACE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmitCarrierNegotiation() <em>Transmit Carrier Negotiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitCarrierNegotiation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRANSMIT_CARRIER_NEGOTIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmitCarrierNegotiation() <em>Transmit Carrier Negotiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitCarrierNegotiation()
	 * @generated
	 * @ordered
	 */
	protected Integer transmitCarrierNegotiation = TRANSMIT_CARRIER_NEGOTIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveCarrierNegotiation() <em>Receive Carrier Negotiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveCarrierNegotiation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RECEIVE_CARRIER_NEGOTIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveCarrierNegotiation() <em>Receive Carrier Negotiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveCarrierNegotiation()
	 * @generated
	 * @ordered
	 */
	protected Integer receiveCarrierNegotiation = RECEIVE_CARRIER_NEGOTIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialTransmitCarrierDataRate() <em>Initial Transmit Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTransmitCarrierDataRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long INITIAL_TRANSMIT_CARRIER_DATA_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialTransmitCarrierDataRate() <em>Initial Transmit Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTransmitCarrierDataRate()
	 * @generated
	 * @ordered
	 */
	protected Long initialTransmitCarrierDataRate = INITIAL_TRANSMIT_CARRIER_DATA_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialReceiveCarrierDataRate() <em>Initial Receive Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReceiveCarrierDataRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long INITIAL_RECEIVE_CARRIER_DATA_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialReceiveCarrierDataRate() <em>Initial Receive Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReceiveCarrierDataRate()
	 * @generated
	 * @ordered
	 */
	protected Long initialReceiveCarrierDataRate = INITIAL_RECEIVE_CARRIER_DATA_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierRetrainsRequested() <em>Carrier Retrains Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRetrainsRequested()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CARRIER_RETRAINS_REQUESTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierRetrainsRequested() <em>Carrier Retrains Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRetrainsRequested()
	 * @generated
	 * @ordered
	 */
	protected Integer carrierRetrainsRequested = CARRIER_RETRAINS_REQUESTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierRetrainsGranted() <em>Carrier Retrains Granted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRetrainsGranted()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CARRIER_RETRAINS_GRANTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierRetrainsGranted() <em>Carrier Retrains Granted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRetrainsGranted()
	 * @generated
	 * @ordered
	 */
	protected Integer carrierRetrainsGranted = CARRIER_RETRAINS_GRANTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalTransmitCarrierDataRate() <em>Final Transmit Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalTransmitCarrierDataRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long FINAL_TRANSMIT_CARRIER_DATA_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalTransmitCarrierDataRate() <em>Final Transmit Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalTransmitCarrierDataRate()
	 * @generated
	 * @ordered
	 */
	protected Long finalTransmitCarrierDataRate = FINAL_TRANSMIT_CARRIER_DATA_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalReceiveCarrierDataRate() <em>Final Receive Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalReceiveCarrierDataRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long FINAL_RECEIVE_CARRIER_DATA_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalReceiveCarrierDataRate() <em>Final Receive Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalReceiveCarrierDataRate()
	 * @generated
	 * @ordered
	 */
	protected Long finalReceiveCarrierDataRate = FINAL_RECEIVE_CARRIER_DATA_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminationCause() <em>Termination Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationCause()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TERMINATION_CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminationCause() <em>Termination Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationCause()
	 * @generated
	 * @ordered
	 */
	protected Integer terminationCause = TERMINATION_CAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnimodemRevision() <em>Unimodem Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnimodemRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIMODEM_REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnimodemRevision() <em>Unimodem Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnimodemRevision()
	 * @generated
	 * @ordered
	 */
	protected String unimodemRevision = UNIMODEM_REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedNoiseLevel() <em>Estimated Noise Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedNoiseLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Long ESTIMATED_NOISE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedNoiseLevel() <em>Estimated Noise Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedNoiseLevel()
	 * @generated
	 * @ordered
	 */
	protected Long estimatedNoiseLevel = ESTIMATED_NOISE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalizedMeanSquaredError() <em>Normalized Mean Squared Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizedMeanSquaredError()
	 * @generated
	 * @ordered
	 */
	protected static final Long NORMALIZED_MEAN_SQUARED_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormalizedMeanSquaredError() <em>Normalized Mean Squared Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizedMeanSquaredError()
	 * @generated
	 * @ordered
	 */
	protected Long normalizedMeanSquaredError = NORMALIZED_MEAN_SQUARED_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemporaryCarrierLossEventCount() <em>Temporary Carrier Loss Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporaryCarrierLossEventCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TEMPORARY_CARRIER_LOSS_EVENT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemporaryCarrierLossEventCount() <em>Temporary Carrier Loss Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporaryCarrierLossEventCount()
	 * @generated
	 * @ordered
	 */
	protected Integer temporaryCarrierLossEventCount = TEMPORARY_CARRIER_LOSS_EVENT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierRenegotiationEventCount() <em>Carrier Renegotiation Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRenegotiationEventCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CARRIER_RENEGOTIATION_EVENT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierRenegotiationEventCount() <em>Carrier Renegotiation Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRenegotiationEventCount()
	 * @generated
	 * @ordered
	 */
	protected Integer carrierRenegotiationEventCount = CARRIER_RENEGOTIATION_EVENT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorControlFrameSize() <em>Error Control Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorControlFrameSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ERROR_CONTROL_FRAME_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorControlFrameSize() <em>Error Control Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorControlFrameSize()
	 * @generated
	 * @ordered
	 */
	protected Integer errorControlFrameSize = ERROR_CONTROL_FRAME_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorControlLinkTimeouts() <em>Error Control Link Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorControlLinkTimeouts()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ERROR_CONTROL_LINK_TIMEOUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorControlLinkTimeouts() <em>Error Control Link Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorControlLinkTimeouts()
	 * @generated
	 * @ordered
	 */
	protected Integer errorControlLinkTimeouts = ERROR_CONTROL_LINK_TIMEOUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorControlLinkNAKs() <em>Error Control Link NA Ks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorControlLinkNAKs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ERROR_CONTROL_LINK_NA_KS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorControlLinkNAKs() <em>Error Control Link NA Ks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorControlLinkNAKs()
	 * @generated
	 * @ordered
	 */
	protected Integer errorControlLinkNAKs = ERROR_CONTROL_LINK_NA_KS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmitFlowControl() <em>Transmit Flow Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitFlowControl()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRANSMIT_FLOW_CONTROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmitFlowControl() <em>Transmit Flow Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitFlowControl()
	 * @generated
	 * @ordered
	 */
	protected Integer transmitFlowControl = TRANSMIT_FLOW_CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveFlowControl() <em>Receive Flow Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveFlowControl()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RECEIVE_FLOW_CONTROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveFlowControl() <em>Receive Flow Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveFlowControl()
	 * @generated
	 * @ordered
	 */
	protected Integer receiveFlowControl = RECEIVE_FLOW_CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmitCharsSentFromDTE() <em>Transmit Chars Sent From DTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitCharsSentFromDTE()
	 * @generated
	 * @ordered
	 */
	protected static final Long TRANSMIT_CHARS_SENT_FROM_DTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmitCharsSentFromDTE() <em>Transmit Chars Sent From DTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitCharsSentFromDTE()
	 * @generated
	 * @ordered
	 */
	protected Long transmitCharsSentFromDTE = TRANSMIT_CHARS_SENT_FROM_DTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveCharsSentToDTE() <em>Receive Chars Sent To DTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveCharsSentToDTE()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECEIVE_CHARS_SENT_TO_DTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveCharsSentToDTE() <em>Receive Chars Sent To DTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveCharsSentToDTE()
	 * @generated
	 * @ordered
	 */
	protected Long receiveCharsSentToDTE = RECEIVE_CHARS_SENT_TO_DTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmitCharsLost() <em>Transmit Chars Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitCharsLost()
	 * @generated
	 * @ordered
	 */
	protected static final Long TRANSMIT_CHARS_LOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmitCharsLost() <em>Transmit Chars Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitCharsLost()
	 * @generated
	 * @ordered
	 */
	protected Long transmitCharsLost = TRANSMIT_CHARS_LOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveCharsLost() <em>Receive Chars Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveCharsLost()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECEIVE_CHARS_LOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveCharsLost() <em>Receive Chars Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveCharsLost()
	 * @generated
	 * @ordered
	 */
	protected Long receiveCharsLost = RECEIVE_CHARS_LOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmitIFrameCount() <em>Transmit IFrame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitIFrameCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long TRANSMIT_IFRAME_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmitIFrameCount() <em>Transmit IFrame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitIFrameCount()
	 * @generated
	 * @ordered
	 */
	protected Long transmitIFrameCount = TRANSMIT_IFRAME_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveIFrameCount() <em>Receive IFrame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveIFrameCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECEIVE_IFRAME_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveIFrameCount() <em>Receive IFrame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveIFrameCount()
	 * @generated
	 * @ordered
	 */
	protected Long receiveIFrameCount = RECEIVE_IFRAME_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransmitIFrameErrorCount() <em>Transmit IFrame Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitIFrameErrorCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long TRANSMIT_IFRAME_ERROR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmitIFrameErrorCount() <em>Transmit IFrame Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitIFrameErrorCount()
	 * @generated
	 * @ordered
	 */
	protected Long transmitIFrameErrorCount = TRANSMIT_IFRAME_ERROR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceivedIFrameErrorCount() <em>Received IFrame Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedIFrameErrorCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECEIVED_IFRAME_ERROR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivedIFrameErrorCount() <em>Received IFrame Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedIFrameErrorCount()
	 * @generated
	 * @ordered
	 */
	protected Long receivedIFrameErrorCount = RECEIVED_IFRAME_ERROR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallWaitingEventCount() <em>Call Waiting Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallWaitingEventCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CALL_WAITING_EVENT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallWaitingEventCount() <em>Call Waiting Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallWaitingEventCount()
	 * @generated
	 * @ordered
	 */
	protected Integer callWaitingEventCount = CALL_WAITING_EVENT_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnimodemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Unimodem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCallSetupResultCode() {
		return callSetupResultCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallSetupResultCode(Integer newCallSetupResultCode) {
		Integer oldCallSetupResultCode = callSetupResultCode;
		callSetupResultCode = newCallSetupResultCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__CALL_SETUP_RESULT_CODE, oldCallSetupResultCode, callSetupResultCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMultiMediaMode() {
		return multiMediaMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiMediaMode(Integer newMultiMediaMode) {
		Integer oldMultiMediaMode = multiMediaMode;
		multiMediaMode = newMultiMediaMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__MULTI_MEDIA_MODE, oldMultiMediaMode, multiMediaMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDTEDCEInterfaceMode() {
		return dtedceInterfaceMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDTEDCEInterfaceMode(Integer newDTEDCEInterfaceMode) {
		Integer oldDTEDCEInterfaceMode = dtedceInterfaceMode;
		dtedceInterfaceMode = newDTEDCEInterfaceMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__DTEDCE_INTERFACE_MODE, oldDTEDCEInterfaceMode, dtedceInterfaceMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTransmitCarrierNegotiation() {
		return transmitCarrierNegotiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmitCarrierNegotiation(Integer newTransmitCarrierNegotiation) {
		Integer oldTransmitCarrierNegotiation = transmitCarrierNegotiation;
		transmitCarrierNegotiation = newTransmitCarrierNegotiation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__TRANSMIT_CARRIER_NEGOTIATION, oldTransmitCarrierNegotiation, transmitCarrierNegotiation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReceiveCarrierNegotiation() {
		return receiveCarrierNegotiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveCarrierNegotiation(Integer newReceiveCarrierNegotiation) {
		Integer oldReceiveCarrierNegotiation = receiveCarrierNegotiation;
		receiveCarrierNegotiation = newReceiveCarrierNegotiation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__RECEIVE_CARRIER_NEGOTIATION, oldReceiveCarrierNegotiation, receiveCarrierNegotiation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInitialTransmitCarrierDataRate() {
		return initialTransmitCarrierDataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialTransmitCarrierDataRate(Long newInitialTransmitCarrierDataRate) {
		Long oldInitialTransmitCarrierDataRate = initialTransmitCarrierDataRate;
		initialTransmitCarrierDataRate = newInitialTransmitCarrierDataRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__INITIAL_TRANSMIT_CARRIER_DATA_RATE, oldInitialTransmitCarrierDataRate, initialTransmitCarrierDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInitialReceiveCarrierDataRate() {
		return initialReceiveCarrierDataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialReceiveCarrierDataRate(Long newInitialReceiveCarrierDataRate) {
		Long oldInitialReceiveCarrierDataRate = initialReceiveCarrierDataRate;
		initialReceiveCarrierDataRate = newInitialReceiveCarrierDataRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__INITIAL_RECEIVE_CARRIER_DATA_RATE, oldInitialReceiveCarrierDataRate, initialReceiveCarrierDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCarrierRetrainsRequested() {
		return carrierRetrainsRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRetrainsRequested(Integer newCarrierRetrainsRequested) {
		Integer oldCarrierRetrainsRequested = carrierRetrainsRequested;
		carrierRetrainsRequested = newCarrierRetrainsRequested;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__CARRIER_RETRAINS_REQUESTED, oldCarrierRetrainsRequested, carrierRetrainsRequested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCarrierRetrainsGranted() {
		return carrierRetrainsGranted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRetrainsGranted(Integer newCarrierRetrainsGranted) {
		Integer oldCarrierRetrainsGranted = carrierRetrainsGranted;
		carrierRetrainsGranted = newCarrierRetrainsGranted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__CARRIER_RETRAINS_GRANTED, oldCarrierRetrainsGranted, carrierRetrainsGranted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFinalTransmitCarrierDataRate() {
		return finalTransmitCarrierDataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinalTransmitCarrierDataRate(Long newFinalTransmitCarrierDataRate) {
		Long oldFinalTransmitCarrierDataRate = finalTransmitCarrierDataRate;
		finalTransmitCarrierDataRate = newFinalTransmitCarrierDataRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__FINAL_TRANSMIT_CARRIER_DATA_RATE, oldFinalTransmitCarrierDataRate, finalTransmitCarrierDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFinalReceiveCarrierDataRate() {
		return finalReceiveCarrierDataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinalReceiveCarrierDataRate(Long newFinalReceiveCarrierDataRate) {
		Long oldFinalReceiveCarrierDataRate = finalReceiveCarrierDataRate;
		finalReceiveCarrierDataRate = newFinalReceiveCarrierDataRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__FINAL_RECEIVE_CARRIER_DATA_RATE, oldFinalReceiveCarrierDataRate, finalReceiveCarrierDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTerminationCause() {
		return terminationCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminationCause(Integer newTerminationCause) {
		Integer oldTerminationCause = terminationCause;
		terminationCause = newTerminationCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__TERMINATION_CAUSE, oldTerminationCause, terminationCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnimodemRevision() {
		return unimodemRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnimodemRevision(String newUnimodemRevision) {
		String oldUnimodemRevision = unimodemRevision;
		unimodemRevision = newUnimodemRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__UNIMODEM_REVISION, oldUnimodemRevision, unimodemRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEstimatedNoiseLevel() {
		return estimatedNoiseLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedNoiseLevel(Long newEstimatedNoiseLevel) {
		Long oldEstimatedNoiseLevel = estimatedNoiseLevel;
		estimatedNoiseLevel = newEstimatedNoiseLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__ESTIMATED_NOISE_LEVEL, oldEstimatedNoiseLevel, estimatedNoiseLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNormalizedMeanSquaredError() {
		return normalizedMeanSquaredError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNormalizedMeanSquaredError(Long newNormalizedMeanSquaredError) {
		Long oldNormalizedMeanSquaredError = normalizedMeanSquaredError;
		normalizedMeanSquaredError = newNormalizedMeanSquaredError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__NORMALIZED_MEAN_SQUARED_ERROR, oldNormalizedMeanSquaredError, normalizedMeanSquaredError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTemporaryCarrierLossEventCount() {
		return temporaryCarrierLossEventCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporaryCarrierLossEventCount(Integer newTemporaryCarrierLossEventCount) {
		Integer oldTemporaryCarrierLossEventCount = temporaryCarrierLossEventCount;
		temporaryCarrierLossEventCount = newTemporaryCarrierLossEventCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__TEMPORARY_CARRIER_LOSS_EVENT_COUNT, oldTemporaryCarrierLossEventCount, temporaryCarrierLossEventCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCarrierRenegotiationEventCount() {
		return carrierRenegotiationEventCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRenegotiationEventCount(Integer newCarrierRenegotiationEventCount) {
		Integer oldCarrierRenegotiationEventCount = carrierRenegotiationEventCount;
		carrierRenegotiationEventCount = newCarrierRenegotiationEventCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__CARRIER_RENEGOTIATION_EVENT_COUNT, oldCarrierRenegotiationEventCount, carrierRenegotiationEventCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getErrorControlFrameSize() {
		return errorControlFrameSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorControlFrameSize(Integer newErrorControlFrameSize) {
		Integer oldErrorControlFrameSize = errorControlFrameSize;
		errorControlFrameSize = newErrorControlFrameSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__ERROR_CONTROL_FRAME_SIZE, oldErrorControlFrameSize, errorControlFrameSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getErrorControlLinkTimeouts() {
		return errorControlLinkTimeouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorControlLinkTimeouts(Integer newErrorControlLinkTimeouts) {
		Integer oldErrorControlLinkTimeouts = errorControlLinkTimeouts;
		errorControlLinkTimeouts = newErrorControlLinkTimeouts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__ERROR_CONTROL_LINK_TIMEOUTS, oldErrorControlLinkTimeouts, errorControlLinkTimeouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getErrorControlLinkNAKs() {
		return errorControlLinkNAKs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorControlLinkNAKs(Integer newErrorControlLinkNAKs) {
		Integer oldErrorControlLinkNAKs = errorControlLinkNAKs;
		errorControlLinkNAKs = newErrorControlLinkNAKs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__ERROR_CONTROL_LINK_NA_KS, oldErrorControlLinkNAKs, errorControlLinkNAKs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTransmitFlowControl() {
		return transmitFlowControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmitFlowControl(Integer newTransmitFlowControl) {
		Integer oldTransmitFlowControl = transmitFlowControl;
		transmitFlowControl = newTransmitFlowControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__TRANSMIT_FLOW_CONTROL, oldTransmitFlowControl, transmitFlowControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReceiveFlowControl() {
		return receiveFlowControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveFlowControl(Integer newReceiveFlowControl) {
		Integer oldReceiveFlowControl = receiveFlowControl;
		receiveFlowControl = newReceiveFlowControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__RECEIVE_FLOW_CONTROL, oldReceiveFlowControl, receiveFlowControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTransmitCharsSentFromDTE() {
		return transmitCharsSentFromDTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmitCharsSentFromDTE(Long newTransmitCharsSentFromDTE) {
		Long oldTransmitCharsSentFromDTE = transmitCharsSentFromDTE;
		transmitCharsSentFromDTE = newTransmitCharsSentFromDTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__TRANSMIT_CHARS_SENT_FROM_DTE, oldTransmitCharsSentFromDTE, transmitCharsSentFromDTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReceiveCharsSentToDTE() {
		return receiveCharsSentToDTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveCharsSentToDTE(Long newReceiveCharsSentToDTE) {
		Long oldReceiveCharsSentToDTE = receiveCharsSentToDTE;
		receiveCharsSentToDTE = newReceiveCharsSentToDTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__RECEIVE_CHARS_SENT_TO_DTE, oldReceiveCharsSentToDTE, receiveCharsSentToDTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTransmitCharsLost() {
		return transmitCharsLost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmitCharsLost(Long newTransmitCharsLost) {
		Long oldTransmitCharsLost = transmitCharsLost;
		transmitCharsLost = newTransmitCharsLost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__TRANSMIT_CHARS_LOST, oldTransmitCharsLost, transmitCharsLost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReceiveCharsLost() {
		return receiveCharsLost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveCharsLost(Long newReceiveCharsLost) {
		Long oldReceiveCharsLost = receiveCharsLost;
		receiveCharsLost = newReceiveCharsLost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__RECEIVE_CHARS_LOST, oldReceiveCharsLost, receiveCharsLost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTransmitIFrameCount() {
		return transmitIFrameCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmitIFrameCount(Long newTransmitIFrameCount) {
		Long oldTransmitIFrameCount = transmitIFrameCount;
		transmitIFrameCount = newTransmitIFrameCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__TRANSMIT_IFRAME_COUNT, oldTransmitIFrameCount, transmitIFrameCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReceiveIFrameCount() {
		return receiveIFrameCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveIFrameCount(Long newReceiveIFrameCount) {
		Long oldReceiveIFrameCount = receiveIFrameCount;
		receiveIFrameCount = newReceiveIFrameCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__RECEIVE_IFRAME_COUNT, oldReceiveIFrameCount, receiveIFrameCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTransmitIFrameErrorCount() {
		return transmitIFrameErrorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmitIFrameErrorCount(Long newTransmitIFrameErrorCount) {
		Long oldTransmitIFrameErrorCount = transmitIFrameErrorCount;
		transmitIFrameErrorCount = newTransmitIFrameErrorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__TRANSMIT_IFRAME_ERROR_COUNT, oldTransmitIFrameErrorCount, transmitIFrameErrorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReceivedIFrameErrorCount() {
		return receivedIFrameErrorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceivedIFrameErrorCount(Long newReceivedIFrameErrorCount) {
		Long oldReceivedIFrameErrorCount = receivedIFrameErrorCount;
		receivedIFrameErrorCount = newReceivedIFrameErrorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__RECEIVED_IFRAME_ERROR_COUNT, oldReceivedIFrameErrorCount, receivedIFrameErrorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCallWaitingEventCount() {
		return callWaitingEventCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallWaitingEventCount(Integer newCallWaitingEventCount) {
		Integer oldCallWaitingEventCount = callWaitingEventCount;
		callWaitingEventCount = newCallWaitingEventCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIMODEM__CALL_WAITING_EVENT_COUNT, oldCallWaitingEventCount, callWaitingEventCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNIMODEM__CALL_SETUP_RESULT_CODE:
				return getCallSetupResultCode();
			case CimPackage.CIM_UNIMODEM__MULTI_MEDIA_MODE:
				return getMultiMediaMode();
			case CimPackage.CIM_UNIMODEM__DTEDCE_INTERFACE_MODE:
				return getDTEDCEInterfaceMode();
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CARRIER_NEGOTIATION:
				return getTransmitCarrierNegotiation();
			case CimPackage.CIM_UNIMODEM__RECEIVE_CARRIER_NEGOTIATION:
				return getReceiveCarrierNegotiation();
			case CimPackage.CIM_UNIMODEM__INITIAL_TRANSMIT_CARRIER_DATA_RATE:
				return getInitialTransmitCarrierDataRate();
			case CimPackage.CIM_UNIMODEM__INITIAL_RECEIVE_CARRIER_DATA_RATE:
				return getInitialReceiveCarrierDataRate();
			case CimPackage.CIM_UNIMODEM__CARRIER_RETRAINS_REQUESTED:
				return getCarrierRetrainsRequested();
			case CimPackage.CIM_UNIMODEM__CARRIER_RETRAINS_GRANTED:
				return getCarrierRetrainsGranted();
			case CimPackage.CIM_UNIMODEM__FINAL_TRANSMIT_CARRIER_DATA_RATE:
				return getFinalTransmitCarrierDataRate();
			case CimPackage.CIM_UNIMODEM__FINAL_RECEIVE_CARRIER_DATA_RATE:
				return getFinalReceiveCarrierDataRate();
			case CimPackage.CIM_UNIMODEM__TERMINATION_CAUSE:
				return getTerminationCause();
			case CimPackage.CIM_UNIMODEM__UNIMODEM_REVISION:
				return getUnimodemRevision();
			case CimPackage.CIM_UNIMODEM__ESTIMATED_NOISE_LEVEL:
				return getEstimatedNoiseLevel();
			case CimPackage.CIM_UNIMODEM__NORMALIZED_MEAN_SQUARED_ERROR:
				return getNormalizedMeanSquaredError();
			case CimPackage.CIM_UNIMODEM__TEMPORARY_CARRIER_LOSS_EVENT_COUNT:
				return getTemporaryCarrierLossEventCount();
			case CimPackage.CIM_UNIMODEM__CARRIER_RENEGOTIATION_EVENT_COUNT:
				return getCarrierRenegotiationEventCount();
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_FRAME_SIZE:
				return getErrorControlFrameSize();
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_LINK_TIMEOUTS:
				return getErrorControlLinkTimeouts();
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_LINK_NA_KS:
				return getErrorControlLinkNAKs();
			case CimPackage.CIM_UNIMODEM__TRANSMIT_FLOW_CONTROL:
				return getTransmitFlowControl();
			case CimPackage.CIM_UNIMODEM__RECEIVE_FLOW_CONTROL:
				return getReceiveFlowControl();
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CHARS_SENT_FROM_DTE:
				return getTransmitCharsSentFromDTE();
			case CimPackage.CIM_UNIMODEM__RECEIVE_CHARS_SENT_TO_DTE:
				return getReceiveCharsSentToDTE();
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CHARS_LOST:
				return getTransmitCharsLost();
			case CimPackage.CIM_UNIMODEM__RECEIVE_CHARS_LOST:
				return getReceiveCharsLost();
			case CimPackage.CIM_UNIMODEM__TRANSMIT_IFRAME_COUNT:
				return getTransmitIFrameCount();
			case CimPackage.CIM_UNIMODEM__RECEIVE_IFRAME_COUNT:
				return getReceiveIFrameCount();
			case CimPackage.CIM_UNIMODEM__TRANSMIT_IFRAME_ERROR_COUNT:
				return getTransmitIFrameErrorCount();
			case CimPackage.CIM_UNIMODEM__RECEIVED_IFRAME_ERROR_COUNT:
				return getReceivedIFrameErrorCount();
			case CimPackage.CIM_UNIMODEM__CALL_WAITING_EVENT_COUNT:
				return getCallWaitingEventCount();
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
			case CimPackage.CIM_UNIMODEM__CALL_SETUP_RESULT_CODE:
				setCallSetupResultCode((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__MULTI_MEDIA_MODE:
				setMultiMediaMode((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__DTEDCE_INTERFACE_MODE:
				setDTEDCEInterfaceMode((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CARRIER_NEGOTIATION:
				setTransmitCarrierNegotiation((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVE_CARRIER_NEGOTIATION:
				setReceiveCarrierNegotiation((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__INITIAL_TRANSMIT_CARRIER_DATA_RATE:
				setInitialTransmitCarrierDataRate((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__INITIAL_RECEIVE_CARRIER_DATA_RATE:
				setInitialReceiveCarrierDataRate((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__CARRIER_RETRAINS_REQUESTED:
				setCarrierRetrainsRequested((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__CARRIER_RETRAINS_GRANTED:
				setCarrierRetrainsGranted((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__FINAL_TRANSMIT_CARRIER_DATA_RATE:
				setFinalTransmitCarrierDataRate((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__FINAL_RECEIVE_CARRIER_DATA_RATE:
				setFinalReceiveCarrierDataRate((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__TERMINATION_CAUSE:
				setTerminationCause((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__UNIMODEM_REVISION:
				setUnimodemRevision((String)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__ESTIMATED_NOISE_LEVEL:
				setEstimatedNoiseLevel((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__NORMALIZED_MEAN_SQUARED_ERROR:
				setNormalizedMeanSquaredError((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__TEMPORARY_CARRIER_LOSS_EVENT_COUNT:
				setTemporaryCarrierLossEventCount((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__CARRIER_RENEGOTIATION_EVENT_COUNT:
				setCarrierRenegotiationEventCount((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_FRAME_SIZE:
				setErrorControlFrameSize((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_LINK_TIMEOUTS:
				setErrorControlLinkTimeouts((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_LINK_NA_KS:
				setErrorControlLinkNAKs((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_FLOW_CONTROL:
				setTransmitFlowControl((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVE_FLOW_CONTROL:
				setReceiveFlowControl((Integer)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CHARS_SENT_FROM_DTE:
				setTransmitCharsSentFromDTE((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVE_CHARS_SENT_TO_DTE:
				setReceiveCharsSentToDTE((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CHARS_LOST:
				setTransmitCharsLost((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVE_CHARS_LOST:
				setReceiveCharsLost((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_IFRAME_COUNT:
				setTransmitIFrameCount((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVE_IFRAME_COUNT:
				setReceiveIFrameCount((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_IFRAME_ERROR_COUNT:
				setTransmitIFrameErrorCount((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVED_IFRAME_ERROR_COUNT:
				setReceivedIFrameErrorCount((Long)newValue);
				return;
			case CimPackage.CIM_UNIMODEM__CALL_WAITING_EVENT_COUNT:
				setCallWaitingEventCount((Integer)newValue);
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
			case CimPackage.CIM_UNIMODEM__CALL_SETUP_RESULT_CODE:
				setCallSetupResultCode(CALL_SETUP_RESULT_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__MULTI_MEDIA_MODE:
				setMultiMediaMode(MULTI_MEDIA_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__DTEDCE_INTERFACE_MODE:
				setDTEDCEInterfaceMode(DTEDCE_INTERFACE_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CARRIER_NEGOTIATION:
				setTransmitCarrierNegotiation(TRANSMIT_CARRIER_NEGOTIATION_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVE_CARRIER_NEGOTIATION:
				setReceiveCarrierNegotiation(RECEIVE_CARRIER_NEGOTIATION_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__INITIAL_TRANSMIT_CARRIER_DATA_RATE:
				setInitialTransmitCarrierDataRate(INITIAL_TRANSMIT_CARRIER_DATA_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__INITIAL_RECEIVE_CARRIER_DATA_RATE:
				setInitialReceiveCarrierDataRate(INITIAL_RECEIVE_CARRIER_DATA_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__CARRIER_RETRAINS_REQUESTED:
				setCarrierRetrainsRequested(CARRIER_RETRAINS_REQUESTED_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__CARRIER_RETRAINS_GRANTED:
				setCarrierRetrainsGranted(CARRIER_RETRAINS_GRANTED_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__FINAL_TRANSMIT_CARRIER_DATA_RATE:
				setFinalTransmitCarrierDataRate(FINAL_TRANSMIT_CARRIER_DATA_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__FINAL_RECEIVE_CARRIER_DATA_RATE:
				setFinalReceiveCarrierDataRate(FINAL_RECEIVE_CARRIER_DATA_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__TERMINATION_CAUSE:
				setTerminationCause(TERMINATION_CAUSE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__UNIMODEM_REVISION:
				setUnimodemRevision(UNIMODEM_REVISION_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__ESTIMATED_NOISE_LEVEL:
				setEstimatedNoiseLevel(ESTIMATED_NOISE_LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__NORMALIZED_MEAN_SQUARED_ERROR:
				setNormalizedMeanSquaredError(NORMALIZED_MEAN_SQUARED_ERROR_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__TEMPORARY_CARRIER_LOSS_EVENT_COUNT:
				setTemporaryCarrierLossEventCount(TEMPORARY_CARRIER_LOSS_EVENT_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__CARRIER_RENEGOTIATION_EVENT_COUNT:
				setCarrierRenegotiationEventCount(CARRIER_RENEGOTIATION_EVENT_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_FRAME_SIZE:
				setErrorControlFrameSize(ERROR_CONTROL_FRAME_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_LINK_TIMEOUTS:
				setErrorControlLinkTimeouts(ERROR_CONTROL_LINK_TIMEOUTS_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_LINK_NA_KS:
				setErrorControlLinkNAKs(ERROR_CONTROL_LINK_NA_KS_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_FLOW_CONTROL:
				setTransmitFlowControl(TRANSMIT_FLOW_CONTROL_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVE_FLOW_CONTROL:
				setReceiveFlowControl(RECEIVE_FLOW_CONTROL_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CHARS_SENT_FROM_DTE:
				setTransmitCharsSentFromDTE(TRANSMIT_CHARS_SENT_FROM_DTE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVE_CHARS_SENT_TO_DTE:
				setReceiveCharsSentToDTE(RECEIVE_CHARS_SENT_TO_DTE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CHARS_LOST:
				setTransmitCharsLost(TRANSMIT_CHARS_LOST_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVE_CHARS_LOST:
				setReceiveCharsLost(RECEIVE_CHARS_LOST_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_IFRAME_COUNT:
				setTransmitIFrameCount(TRANSMIT_IFRAME_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVE_IFRAME_COUNT:
				setReceiveIFrameCount(RECEIVE_IFRAME_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__TRANSMIT_IFRAME_ERROR_COUNT:
				setTransmitIFrameErrorCount(TRANSMIT_IFRAME_ERROR_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__RECEIVED_IFRAME_ERROR_COUNT:
				setReceivedIFrameErrorCount(RECEIVED_IFRAME_ERROR_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_UNIMODEM__CALL_WAITING_EVENT_COUNT:
				setCallWaitingEventCount(CALL_WAITING_EVENT_COUNT_EDEFAULT);
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
			case CimPackage.CIM_UNIMODEM__CALL_SETUP_RESULT_CODE:
				return CALL_SETUP_RESULT_CODE_EDEFAULT == null ? callSetupResultCode != null : !CALL_SETUP_RESULT_CODE_EDEFAULT.equals(callSetupResultCode);
			case CimPackage.CIM_UNIMODEM__MULTI_MEDIA_MODE:
				return MULTI_MEDIA_MODE_EDEFAULT == null ? multiMediaMode != null : !MULTI_MEDIA_MODE_EDEFAULT.equals(multiMediaMode);
			case CimPackage.CIM_UNIMODEM__DTEDCE_INTERFACE_MODE:
				return DTEDCE_INTERFACE_MODE_EDEFAULT == null ? dtedceInterfaceMode != null : !DTEDCE_INTERFACE_MODE_EDEFAULT.equals(dtedceInterfaceMode);
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CARRIER_NEGOTIATION:
				return TRANSMIT_CARRIER_NEGOTIATION_EDEFAULT == null ? transmitCarrierNegotiation != null : !TRANSMIT_CARRIER_NEGOTIATION_EDEFAULT.equals(transmitCarrierNegotiation);
			case CimPackage.CIM_UNIMODEM__RECEIVE_CARRIER_NEGOTIATION:
				return RECEIVE_CARRIER_NEGOTIATION_EDEFAULT == null ? receiveCarrierNegotiation != null : !RECEIVE_CARRIER_NEGOTIATION_EDEFAULT.equals(receiveCarrierNegotiation);
			case CimPackage.CIM_UNIMODEM__INITIAL_TRANSMIT_CARRIER_DATA_RATE:
				return INITIAL_TRANSMIT_CARRIER_DATA_RATE_EDEFAULT == null ? initialTransmitCarrierDataRate != null : !INITIAL_TRANSMIT_CARRIER_DATA_RATE_EDEFAULT.equals(initialTransmitCarrierDataRate);
			case CimPackage.CIM_UNIMODEM__INITIAL_RECEIVE_CARRIER_DATA_RATE:
				return INITIAL_RECEIVE_CARRIER_DATA_RATE_EDEFAULT == null ? initialReceiveCarrierDataRate != null : !INITIAL_RECEIVE_CARRIER_DATA_RATE_EDEFAULT.equals(initialReceiveCarrierDataRate);
			case CimPackage.CIM_UNIMODEM__CARRIER_RETRAINS_REQUESTED:
				return CARRIER_RETRAINS_REQUESTED_EDEFAULT == null ? carrierRetrainsRequested != null : !CARRIER_RETRAINS_REQUESTED_EDEFAULT.equals(carrierRetrainsRequested);
			case CimPackage.CIM_UNIMODEM__CARRIER_RETRAINS_GRANTED:
				return CARRIER_RETRAINS_GRANTED_EDEFAULT == null ? carrierRetrainsGranted != null : !CARRIER_RETRAINS_GRANTED_EDEFAULT.equals(carrierRetrainsGranted);
			case CimPackage.CIM_UNIMODEM__FINAL_TRANSMIT_CARRIER_DATA_RATE:
				return FINAL_TRANSMIT_CARRIER_DATA_RATE_EDEFAULT == null ? finalTransmitCarrierDataRate != null : !FINAL_TRANSMIT_CARRIER_DATA_RATE_EDEFAULT.equals(finalTransmitCarrierDataRate);
			case CimPackage.CIM_UNIMODEM__FINAL_RECEIVE_CARRIER_DATA_RATE:
				return FINAL_RECEIVE_CARRIER_DATA_RATE_EDEFAULT == null ? finalReceiveCarrierDataRate != null : !FINAL_RECEIVE_CARRIER_DATA_RATE_EDEFAULT.equals(finalReceiveCarrierDataRate);
			case CimPackage.CIM_UNIMODEM__TERMINATION_CAUSE:
				return TERMINATION_CAUSE_EDEFAULT == null ? terminationCause != null : !TERMINATION_CAUSE_EDEFAULT.equals(terminationCause);
			case CimPackage.CIM_UNIMODEM__UNIMODEM_REVISION:
				return UNIMODEM_REVISION_EDEFAULT == null ? unimodemRevision != null : !UNIMODEM_REVISION_EDEFAULT.equals(unimodemRevision);
			case CimPackage.CIM_UNIMODEM__ESTIMATED_NOISE_LEVEL:
				return ESTIMATED_NOISE_LEVEL_EDEFAULT == null ? estimatedNoiseLevel != null : !ESTIMATED_NOISE_LEVEL_EDEFAULT.equals(estimatedNoiseLevel);
			case CimPackage.CIM_UNIMODEM__NORMALIZED_MEAN_SQUARED_ERROR:
				return NORMALIZED_MEAN_SQUARED_ERROR_EDEFAULT == null ? normalizedMeanSquaredError != null : !NORMALIZED_MEAN_SQUARED_ERROR_EDEFAULT.equals(normalizedMeanSquaredError);
			case CimPackage.CIM_UNIMODEM__TEMPORARY_CARRIER_LOSS_EVENT_COUNT:
				return TEMPORARY_CARRIER_LOSS_EVENT_COUNT_EDEFAULT == null ? temporaryCarrierLossEventCount != null : !TEMPORARY_CARRIER_LOSS_EVENT_COUNT_EDEFAULT.equals(temporaryCarrierLossEventCount);
			case CimPackage.CIM_UNIMODEM__CARRIER_RENEGOTIATION_EVENT_COUNT:
				return CARRIER_RENEGOTIATION_EVENT_COUNT_EDEFAULT == null ? carrierRenegotiationEventCount != null : !CARRIER_RENEGOTIATION_EVENT_COUNT_EDEFAULT.equals(carrierRenegotiationEventCount);
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_FRAME_SIZE:
				return ERROR_CONTROL_FRAME_SIZE_EDEFAULT == null ? errorControlFrameSize != null : !ERROR_CONTROL_FRAME_SIZE_EDEFAULT.equals(errorControlFrameSize);
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_LINK_TIMEOUTS:
				return ERROR_CONTROL_LINK_TIMEOUTS_EDEFAULT == null ? errorControlLinkTimeouts != null : !ERROR_CONTROL_LINK_TIMEOUTS_EDEFAULT.equals(errorControlLinkTimeouts);
			case CimPackage.CIM_UNIMODEM__ERROR_CONTROL_LINK_NA_KS:
				return ERROR_CONTROL_LINK_NA_KS_EDEFAULT == null ? errorControlLinkNAKs != null : !ERROR_CONTROL_LINK_NA_KS_EDEFAULT.equals(errorControlLinkNAKs);
			case CimPackage.CIM_UNIMODEM__TRANSMIT_FLOW_CONTROL:
				return TRANSMIT_FLOW_CONTROL_EDEFAULT == null ? transmitFlowControl != null : !TRANSMIT_FLOW_CONTROL_EDEFAULT.equals(transmitFlowControl);
			case CimPackage.CIM_UNIMODEM__RECEIVE_FLOW_CONTROL:
				return RECEIVE_FLOW_CONTROL_EDEFAULT == null ? receiveFlowControl != null : !RECEIVE_FLOW_CONTROL_EDEFAULT.equals(receiveFlowControl);
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CHARS_SENT_FROM_DTE:
				return TRANSMIT_CHARS_SENT_FROM_DTE_EDEFAULT == null ? transmitCharsSentFromDTE != null : !TRANSMIT_CHARS_SENT_FROM_DTE_EDEFAULT.equals(transmitCharsSentFromDTE);
			case CimPackage.CIM_UNIMODEM__RECEIVE_CHARS_SENT_TO_DTE:
				return RECEIVE_CHARS_SENT_TO_DTE_EDEFAULT == null ? receiveCharsSentToDTE != null : !RECEIVE_CHARS_SENT_TO_DTE_EDEFAULT.equals(receiveCharsSentToDTE);
			case CimPackage.CIM_UNIMODEM__TRANSMIT_CHARS_LOST:
				return TRANSMIT_CHARS_LOST_EDEFAULT == null ? transmitCharsLost != null : !TRANSMIT_CHARS_LOST_EDEFAULT.equals(transmitCharsLost);
			case CimPackage.CIM_UNIMODEM__RECEIVE_CHARS_LOST:
				return RECEIVE_CHARS_LOST_EDEFAULT == null ? receiveCharsLost != null : !RECEIVE_CHARS_LOST_EDEFAULT.equals(receiveCharsLost);
			case CimPackage.CIM_UNIMODEM__TRANSMIT_IFRAME_COUNT:
				return TRANSMIT_IFRAME_COUNT_EDEFAULT == null ? transmitIFrameCount != null : !TRANSMIT_IFRAME_COUNT_EDEFAULT.equals(transmitIFrameCount);
			case CimPackage.CIM_UNIMODEM__RECEIVE_IFRAME_COUNT:
				return RECEIVE_IFRAME_COUNT_EDEFAULT == null ? receiveIFrameCount != null : !RECEIVE_IFRAME_COUNT_EDEFAULT.equals(receiveIFrameCount);
			case CimPackage.CIM_UNIMODEM__TRANSMIT_IFRAME_ERROR_COUNT:
				return TRANSMIT_IFRAME_ERROR_COUNT_EDEFAULT == null ? transmitIFrameErrorCount != null : !TRANSMIT_IFRAME_ERROR_COUNT_EDEFAULT.equals(transmitIFrameErrorCount);
			case CimPackage.CIM_UNIMODEM__RECEIVED_IFRAME_ERROR_COUNT:
				return RECEIVED_IFRAME_ERROR_COUNT_EDEFAULT == null ? receivedIFrameErrorCount != null : !RECEIVED_IFRAME_ERROR_COUNT_EDEFAULT.equals(receivedIFrameErrorCount);
			case CimPackage.CIM_UNIMODEM__CALL_WAITING_EVENT_COUNT:
				return CALL_WAITING_EVENT_COUNT_EDEFAULT == null ? callWaitingEventCount != null : !CALL_WAITING_EVENT_COUNT_EDEFAULT.equals(callWaitingEventCount);
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
		result.append(" (CallSetupResultCode: ");
		result.append(callSetupResultCode);
		result.append(", MultiMediaMode: ");
		result.append(multiMediaMode);
		result.append(", DTEDCEInterfaceMode: ");
		result.append(dtedceInterfaceMode);
		result.append(", TransmitCarrierNegotiation: ");
		result.append(transmitCarrierNegotiation);
		result.append(", ReceiveCarrierNegotiation: ");
		result.append(receiveCarrierNegotiation);
		result.append(", InitialTransmitCarrierDataRate: ");
		result.append(initialTransmitCarrierDataRate);
		result.append(", InitialReceiveCarrierDataRate: ");
		result.append(initialReceiveCarrierDataRate);
		result.append(", CarrierRetrainsRequested: ");
		result.append(carrierRetrainsRequested);
		result.append(", CarrierRetrainsGranted: ");
		result.append(carrierRetrainsGranted);
		result.append(", FinalTransmitCarrierDataRate: ");
		result.append(finalTransmitCarrierDataRate);
		result.append(", FinalReceiveCarrierDataRate: ");
		result.append(finalReceiveCarrierDataRate);
		result.append(", TerminationCause: ");
		result.append(terminationCause);
		result.append(", UnimodemRevision: ");
		result.append(unimodemRevision);
		result.append(", EstimatedNoiseLevel: ");
		result.append(estimatedNoiseLevel);
		result.append(", NormalizedMeanSquaredError: ");
		result.append(normalizedMeanSquaredError);
		result.append(", TemporaryCarrierLossEventCount: ");
		result.append(temporaryCarrierLossEventCount);
		result.append(", CarrierRenegotiationEventCount: ");
		result.append(carrierRenegotiationEventCount);
		result.append(", ErrorControlFrameSize: ");
		result.append(errorControlFrameSize);
		result.append(", ErrorControlLinkTimeouts: ");
		result.append(errorControlLinkTimeouts);
		result.append(", ErrorControlLinkNAKs: ");
		result.append(errorControlLinkNAKs);
		result.append(", TransmitFlowControl: ");
		result.append(transmitFlowControl);
		result.append(", ReceiveFlowControl: ");
		result.append(receiveFlowControl);
		result.append(", TransmitCharsSentFromDTE: ");
		result.append(transmitCharsSentFromDTE);
		result.append(", ReceiveCharsSentToDTE: ");
		result.append(receiveCharsSentToDTE);
		result.append(", TransmitCharsLost: ");
		result.append(transmitCharsLost);
		result.append(", ReceiveCharsLost: ");
		result.append(receiveCharsLost);
		result.append(", TransmitIFrameCount: ");
		result.append(transmitIFrameCount);
		result.append(", ReceiveIFrameCount: ");
		result.append(receiveIFrameCount);
		result.append(", TransmitIFrameErrorCount: ");
		result.append(transmitIFrameErrorCount);
		result.append(", ReceivedIFrameErrorCount: ");
		result.append(receivedIFrameErrorCount);
		result.append(", CallWaitingEventCount: ");
		result.append(callWaitingEventCount);
		result.append(')');
		return result.toString();
	}

} //CIM_UnimodemImpl
