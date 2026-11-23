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
 * A representation of the model object '<em><b>CIM Unimodem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unimodem is a POTSModem that supports the Unimodem 1.0 Specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getCallSetupResultCode <em>Call Setup Result Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getMultiMediaMode <em>Multi Media Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getDTEDCEInterfaceMode <em>DTEDCE Interface Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getTransmitCarrierNegotiation <em>Transmit Carrier Negotiation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getReceiveCarrierNegotiation <em>Receive Carrier Negotiation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getInitialTransmitCarrierDataRate <em>Initial Transmit Carrier Data Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getInitialReceiveCarrierDataRate <em>Initial Receive Carrier Data Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getCarrierRetrainsRequested <em>Carrier Retrains Requested</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getCarrierRetrainsGranted <em>Carrier Retrains Granted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getFinalTransmitCarrierDataRate <em>Final Transmit Carrier Data Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getFinalReceiveCarrierDataRate <em>Final Receive Carrier Data Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getTerminationCause <em>Termination Cause</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getUnimodemRevision <em>Unimodem Revision</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getEstimatedNoiseLevel <em>Estimated Noise Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getNormalizedMeanSquaredError <em>Normalized Mean Squared Error</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getTemporaryCarrierLossEventCount <em>Temporary Carrier Loss Event Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getCarrierRenegotiationEventCount <em>Carrier Renegotiation Event Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getErrorControlFrameSize <em>Error Control Frame Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getErrorControlLinkTimeouts <em>Error Control Link Timeouts</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getErrorControlLinkNAKs <em>Error Control Link NA Ks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getTransmitFlowControl <em>Transmit Flow Control</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getReceiveFlowControl <em>Receive Flow Control</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getTransmitCharsSentFromDTE <em>Transmit Chars Sent From DTE</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getReceiveCharsSentToDTE <em>Receive Chars Sent To DTE</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getTransmitCharsLost <em>Transmit Chars Lost</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getReceiveCharsLost <em>Receive Chars Lost</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getTransmitIFrameCount <em>Transmit IFrame Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getReceiveIFrameCount <em>Receive IFrame Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getTransmitIFrameErrorCount <em>Transmit IFrame Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getReceivedIFrameErrorCount <em>Received IFrame Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Unimodem#getCallWaitingEventCount <em>Call Waiting Event Count</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Modems' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Unimodem extends CIM_POTSModem {
	/**
	 * Returns the value of the '<em><b>Call Setup Result Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current call setup result code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Call Setup Result Code</em>' attribute.
	 * @see #setCallSetupResultCode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_CallSetupResultCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"No Previous Call\",\"No Dial Tone Detected\",\"Reorder Signal Detected, Network Busy\",\"Busy Signal Detected\",\"No Recognized Signal Detected\",\"Voice Detected\",\"Text Telephone Detected\",\"Data Answering Signal Detected\",\"Data Calling Signal Detected\",\"Fax Answering Signal Detected\",\"Fax Calling Signal Detected\",\"V.8bis Signal Detected\"]'"
	 * @generated
	 */
	Integer getCallSetupResultCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getCallSetupResultCode <em>Call Setup Result Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Setup Result Code</em>' attribute.
	 * @see #getCallSetupResultCode()
	 * @generated
	 */
	void setCallSetupResultCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Multi Media Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current multimedia mode of the Unimodem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Media Mode</em>' attribute.
	 * @see #setMultiMediaMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_MultiMediaMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"]' Values='[\"Data Only\",\"Fax Only\",\"Voice Only\",\"Voice View\",\"ASVD V.61\",\"ASVD V.34Q\",\"DSVD Multi-Tech\",\"DSVD 1.2\",\"DSVD V.70\",\"Video Telephony H.324\",\"Other V.80 Call\"]'"
	 * @generated
	 */
	Integer getMultiMediaMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getMultiMediaMode <em>Multi Media Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Media Mode</em>' attribute.
	 * @see #getMultiMediaMode()
	 * @generated
	 */
	void setMultiMediaMode(Integer value);

	/**
	 * Returns the value of the '<em><b>DTEDCE Interface Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current DTE-DCE interface mode of the Unimodem, such as asynchronous, V.80 transparent, or framed synchronous modes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DTEDCE Interface Mode</em>' attribute.
	 * @see #setDTEDCEInterfaceMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_DTEDCEInterfaceMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Async Data\",\"V.80 Transparent Synchronous Mode\",\"V.80 Framed Synchronous Mode\"]'"
	 * @generated
	 */
	Integer getDTEDCEInterfaceMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getDTEDCEInterfaceMode <em>DTEDCE Interface Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DTEDCE Interface Mode</em>' attribute.
	 * @see #getDTEDCEInterfaceMode()
	 * @generated
	 */
	void setDTEDCEInterfaceMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Transmit Carrier Negotiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The active transmit modulation scheme.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmit Carrier Negotiation</em>' attribute.
	 * @see #setTransmitCarrierNegotiation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_TransmitCarrierNegotiation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23..65535\"]' Values='[\"V.17 (G3 Fax Call)\",\"V.21\",\"V.22\",\"V.22bis\",\"V.23 Constant Carrier (1200/75)\",\"V.23 Switched Carrier (Half Duplex)\",\"V.26bis\",\"V.26ter\",\"V.27ter (G3 Fax Call)\",\"V.29 HD (G3 Fax Call)\",\"V.32\",\"V.32bis\",\"V.34\",\"V.34 HD (G3 Fax Call)\",\"V.90 Issue 1 (Asymmetric)\",\"V.90 Issue 2 (Symmetric)\",\"Reserved (V.58)\",\"X2\",\"K56FLEX\",\"V.FC\",\"V.32terbo\",\"Bell 212A\",\"Bell 103\",\"Reserved for Mfgs\"]'"
	 * @generated
	 */
	Integer getTransmitCarrierNegotiation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getTransmitCarrierNegotiation <em>Transmit Carrier Negotiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmit Carrier Negotiation</em>' attribute.
	 * @see #getTransmitCarrierNegotiation()
	 * @generated
	 */
	void setTransmitCarrierNegotiation(Integer value);

	/**
	 * Returns the value of the '<em><b>Receive Carrier Negotiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The active receive modulation scheme.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Carrier Negotiation</em>' attribute.
	 * @see #setReceiveCarrierNegotiation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_ReceiveCarrierNegotiation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23..65535\"]' Values='[\"V.17 (G3 Fax Call)\",\"V.21\",\"V.22\",\"V.22bis\",\"V.23 Constant Carrier (1200/75)\",\"V.23 Switched Carrier (Half Duplex)\",\"V.26bis\",\"V.26ter\",\"V.27ter (G3 Fax Call)\",\"V.29 HD (G3 Fax Call)\",\"V.32\",\"V.32bis\",\"V.34\",\"V.34 HD (G3 Fax Call)\",\"V.90 Issue 1 (Asymmetric)\",\"V.90 Issue 2 (Symmetric)\",\"Reserved (V.58)\",\"X2\",\"K56FLEX\",\"V.FC\",\"V.32terbo\",\"Bell 212A\",\"Bell 103\",\"Reserved for Mfgs\"]'"
	 * @generated
	 */
	Integer getReceiveCarrierNegotiation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getReceiveCarrierNegotiation <em>Receive Carrier Negotiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Carrier Negotiation</em>' attribute.
	 * @see #getReceiveCarrierNegotiation()
	 * @generated
	 */
	void setReceiveCarrierNegotiation(Integer value);

	/**
	 * Returns the value of the '<em><b>Initial Transmit Carrier Data Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial transmit carrier data rate for the current or last call, in bits per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Transmit Carrier Data Rate</em>' attribute.
	 * @see #setInitialTransmitCarrierDataRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_InitialTransmitCarrierDataRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getInitialTransmitCarrierDataRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getInitialTransmitCarrierDataRate <em>Initial Transmit Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Transmit Carrier Data Rate</em>' attribute.
	 * @see #getInitialTransmitCarrierDataRate()
	 * @generated
	 */
	void setInitialTransmitCarrierDataRate(Long value);

	/**
	 * Returns the value of the '<em><b>Initial Receive Carrier Data Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial receive carrier data rate for the current or last call, in bits per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Receive Carrier Data Rate</em>' attribute.
	 * @see #setInitialReceiveCarrierDataRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_InitialReceiveCarrierDataRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getInitialReceiveCarrierDataRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getInitialReceiveCarrierDataRate <em>Initial Receive Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Receive Carrier Data Rate</em>' attribute.
	 * @see #getInitialReceiveCarrierDataRate()
	 * @generated
	 */
	void setInitialReceiveCarrierDataRate(Long value);

	/**
	 * Returns the value of the '<em><b>Carrier Retrains Requested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of carrier retrains requested during the current or last call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Retrains Requested</em>' attribute.
	 * @see #setCarrierRetrainsRequested(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_CarrierRetrainsRequested()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Counter='true'"
	 * @generated
	 */
	Integer getCarrierRetrainsRequested();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getCarrierRetrainsRequested <em>Carrier Retrains Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Retrains Requested</em>' attribute.
	 * @see #getCarrierRetrainsRequested()
	 * @generated
	 */
	void setCarrierRetrainsRequested(Integer value);

	/**
	 * Returns the value of the '<em><b>Carrier Retrains Granted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of carrier retrains granted during the current or last call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Retrains Granted</em>' attribute.
	 * @see #setCarrierRetrainsGranted(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_CarrierRetrainsGranted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Counter='true'"
	 * @generated
	 */
	Integer getCarrierRetrainsGranted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getCarrierRetrainsGranted <em>Carrier Retrains Granted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Retrains Granted</em>' attribute.
	 * @see #getCarrierRetrainsGranted()
	 * @generated
	 */
	void setCarrierRetrainsGranted(Integer value);

	/**
	 * Returns the value of the '<em><b>Final Transmit Carrier Data Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Final transmit carrier data rate of the current or last call, in bits per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final Transmit Carrier Data Rate</em>' attribute.
	 * @see #setFinalTransmitCarrierDataRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_FinalTransmitCarrierDataRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getFinalTransmitCarrierDataRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getFinalTransmitCarrierDataRate <em>Final Transmit Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Transmit Carrier Data Rate</em>' attribute.
	 * @see #getFinalTransmitCarrierDataRate()
	 * @generated
	 */
	void setFinalTransmitCarrierDataRate(Long value);

	/**
	 * Returns the value of the '<em><b>Final Receive Carrier Data Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Final receive carrier data rate of the current or last call, in bits per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final Receive Carrier Data Rate</em>' attribute.
	 * @see #setFinalReceiveCarrierDataRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_FinalReceiveCarrierDataRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getFinalReceiveCarrierDataRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getFinalReceiveCarrierDataRate <em>Final Receive Carrier Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Receive Carrier Data Rate</em>' attribute.
	 * @see #getFinalReceiveCarrierDataRate()
	 * @generated
	 */
	void setFinalReceiveCarrierDataRate(Long value);

	/**
	 * Returns the value of the '<em><b>Termination Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cause of last call termination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Termination Cause</em>' attribute.
	 * @see #setTerminationCause(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_TerminationCause()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\"]' Values='[\"Cause Unidentified\",\"No Previous Call\",\"Call Is Still in Progress\",\"Call Waiting Signal Detected\",\"Delayed\",\"NMS Initiated Dial Call\",\"NMS Initiated Leased Line Restoral\",\"NMS Initiated Redial\",\"NMS Initiated Dial Disconnect\",\"Power Loss\",\"Equipment Failure\",\"Front Panel Disconnect Requested\",\"Front Panel Leased Line Restoral\",\"Automatic Leased Line Restoral\",\"Inactivity Timer Expired\",\"cct116 Restoral Request\",\"cct108 Is Off Inhibits Dial\",\"cct108 Turned Off\",\"No Number Provided\",\"Blacklisted Number\",\"Call Attempts Limit Exceeded\",\"Extension Phone Off Hook\",\"Call Setup Fail Timer Expired\",\"Incoming Call Detected\",\"Loop Current Interrupted\",\"No Dial Tone\",\"Voice Detected\",\"Reorder Tone\",\"Sit Tone\",\"Engaged Tone\",\"Long Space Disconnect\",\"Carrier Lost\",\"Training Failed\",\"No Modulation in Common\",\"Retrain Failed\",\"Retrain Attempt Count Exceeded\",\"GSTN Cleardown Received\",\"Fax Detected\",\"In Test Mode\",\"Intrusive Self Test Initiated\",\"Any Key Abort\",\"DTE Hangup Command\",\"DTE Reset Command\",\"Frame Reject\",\"No Error Control Established\",\"Protocol Violation\",\"n400 Exceeded\",\"Negotiation Failed\",\"Disconnect Frame Received\",\"Sabme Frame Received\",\"Loss Of Synchronization\"]'"
	 * @generated
	 */
	Integer getTerminationCause();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getTerminationCause <em>Termination Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Cause</em>' attribute.
	 * @see #getTerminationCause()
	 * @generated
	 */
	void setTerminationCause(Integer value);

	/**
	 * Returns the value of the '<em><b>Unimodem Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagnostic Command Specification, Unimodem revision number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unimodem Revision</em>' attribute.
	 * @see #setUnimodemRevision(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_UnimodemRevision()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getUnimodemRevision();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getUnimodemRevision <em>Unimodem Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unimodem Revision</em>' attribute.
	 * @see #getUnimodemRevision()
	 * @generated
	 */
	void setUnimodemRevision(String value);

	/**
	 * Returns the value of the '<em><b>Estimated Noise Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated noise level for the last or current call in -dBm. Values are in the range of 0-100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Noise Level</em>' attribute.
	 * @see #setEstimatedNoiseLevel(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_EstimatedNoiseLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='-dBm' Gauge='true' PUnit='decibel(m) * -1'"
	 * @generated
	 */
	Long getEstimatedNoiseLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getEstimatedNoiseLevel <em>Estimated Noise Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Noise Level</em>' attribute.
	 * @see #getEstimatedNoiseLevel()
	 * @generated
	 */
	void setEstimatedNoiseLevel(Long value);

	/**
	 * Returns the value of the '<em><b>Normalized Mean Squared Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Normalized mean squared error for the last or current call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normalized Mean Squared Error</em>' attribute.
	 * @see #setNormalizedMeanSquaredError(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_NormalizedMeanSquaredError()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getNormalizedMeanSquaredError();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getNormalizedMeanSquaredError <em>Normalized Mean Squared Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalized Mean Squared Error</em>' attribute.
	 * @see #getNormalizedMeanSquaredError()
	 * @generated
	 */
	void setNormalizedMeanSquaredError(Long value);

	/**
	 * Returns the value of the '<em><b>Temporary Carrier Loss Event Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporary carrier loss event count for the last or current call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temporary Carrier Loss Event Count</em>' attribute.
	 * @see #setTemporaryCarrierLossEventCount(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_TemporaryCarrierLossEventCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Counter='true'"
	 * @generated
	 */
	Integer getTemporaryCarrierLossEventCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getTemporaryCarrierLossEventCount <em>Temporary Carrier Loss Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporary Carrier Loss Event Count</em>' attribute.
	 * @see #getTemporaryCarrierLossEventCount()
	 * @generated
	 */
	void setTemporaryCarrierLossEventCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Carrier Renegotiation Event Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Carrier Rate renegotiation event count for the last or current call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Renegotiation Event Count</em>' attribute.
	 * @see #setCarrierRenegotiationEventCount(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_CarrierRenegotiationEventCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Counter='true'"
	 * @generated
	 */
	Integer getCarrierRenegotiationEventCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getCarrierRenegotiationEventCount <em>Carrier Renegotiation Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Renegotiation Event Count</em>' attribute.
	 * @see #getCarrierRenegotiationEventCount()
	 * @generated
	 */
	void setCarrierRenegotiationEventCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Error Control Frame Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error Control frame size in bytes for the last or current call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Control Frame Size</em>' attribute.
	 * @see #setErrorControlFrameSize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_ErrorControlFrameSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Integer getErrorControlFrameSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getErrorControlFrameSize <em>Error Control Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Control Frame Size</em>' attribute.
	 * @see #getErrorControlFrameSize()
	 * @generated
	 */
	void setErrorControlFrameSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Error Control Link Timeouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error control link timeouts in transmission for the last or current call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Control Link Timeouts</em>' attribute.
	 * @see #setErrorControlLinkTimeouts(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_ErrorControlLinkTimeouts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Counter='true'"
	 * @generated
	 */
	Integer getErrorControlLinkTimeouts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getErrorControlLinkTimeouts <em>Error Control Link Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Control Link Timeouts</em>' attribute.
	 * @see #getErrorControlLinkTimeouts()
	 * @generated
	 */
	void setErrorControlLinkTimeouts(Integer value);

	/**
	 * Returns the value of the '<em><b>Error Control Link NA Ks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error control link NAKs received for the last or current call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Control Link NA Ks</em>' attribute.
	 * @see #setErrorControlLinkNAKs(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_ErrorControlLinkNAKs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Counter='true'"
	 * @generated
	 */
	Integer getErrorControlLinkNAKs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getErrorControlLinkNAKs <em>Error Control Link NA Ks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Control Link NA Ks</em>' attribute.
	 * @see #getErrorControlLinkNAKs()
	 * @generated
	 */
	void setErrorControlLinkNAKs(Integer value);

	/**
	 * Returns the value of the '<em><b>Transmit Flow Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The flow control mechanism used in transmitting data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmit Flow Control</em>' attribute.
	 * @see #setTransmitFlowControl(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_TransmitFlowControl()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Off\",\"DC1/DC3\",\"V.24 ckt 106/133\"]'"
	 * @generated
	 */
	Integer getTransmitFlowControl();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getTransmitFlowControl <em>Transmit Flow Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmit Flow Control</em>' attribute.
	 * @see #getTransmitFlowControl()
	 * @generated
	 */
	void setTransmitFlowControl(Integer value);

	/**
	 * Returns the value of the '<em><b>Receive Flow Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The flow control mechanism used in receiving data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Flow Control</em>' attribute.
	 * @see #setReceiveFlowControl(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_ReceiveFlowControl()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Off\",\"DC1/DC3\",\"V.24 ckt 106/133\"]'"
	 * @generated
	 */
	Integer getReceiveFlowControl();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getReceiveFlowControl <em>Receive Flow Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Flow Control</em>' attribute.
	 * @see #getReceiveFlowControl()
	 * @generated
	 */
	void setReceiveFlowControl(Integer value);

	/**
	 * Returns the value of the '<em><b>Transmit Chars Sent From DTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of transmit chars sent from the DTE for the last or current call. A continuous connection might exceed this value, given enough time. Typically these counters are implemented as 32-bit counters, but additional bits can be provided and are accounted for in this property. If these counters hit maximum value, the DCE manufacturer might roll over to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmit Chars Sent From DTE</em>' attribute.
	 * @see #setTransmitCharsSentFromDTE(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_TransmitCharsSentFromDTE()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTransmitCharsSentFromDTE();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getTransmitCharsSentFromDTE <em>Transmit Chars Sent From DTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmit Chars Sent From DTE</em>' attribute.
	 * @see #getTransmitCharsSentFromDTE()
	 * @generated
	 */
	void setTransmitCharsSentFromDTE(Long value);

	/**
	 * Returns the value of the '<em><b>Receive Chars Sent To DTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of receive chars sent to the DTE for the last or current call. A continuous connection might exceed this value, given enough time. Typically these counters are implemented as 32-bit counters, but additional bits can be provided and are accounted for in this property. If these counters hit maximum value, the DCE manufacturer might roll over to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Chars Sent To DTE</em>' attribute.
	 * @see #setReceiveCharsSentToDTE(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_ReceiveCharsSentToDTE()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReceiveCharsSentToDTE();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getReceiveCharsSentToDTE <em>Receive Chars Sent To DTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Chars Sent To DTE</em>' attribute.
	 * @see #getReceiveCharsSentToDTE()
	 * @generated
	 */
	void setReceiveCharsSentToDTE(Long value);

	/**
	 * Returns the value of the '<em><b>Transmit Chars Lost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of transmit characters lost for the last or current call. A DCE might limit this counter to 16 bits, but additional bits can be provided and are accounted for in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmit Chars Lost</em>' attribute.
	 * @see #setTransmitCharsLost(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_TransmitCharsLost()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTransmitCharsLost();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getTransmitCharsLost <em>Transmit Chars Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmit Chars Lost</em>' attribute.
	 * @see #getTransmitCharsLost()
	 * @generated
	 */
	void setTransmitCharsLost(Long value);

	/**
	 * Returns the value of the '<em><b>Receive Chars Lost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of receive characters lost for the last or current call. A DCE might limit this counter to 16 bits, but additional bits can be provided and are accounted for in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Chars Lost</em>' attribute.
	 * @see #setReceiveCharsLost(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_ReceiveCharsLost()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReceiveCharsLost();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getReceiveCharsLost <em>Receive Chars Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Chars Lost</em>' attribute.
	 * @see #getReceiveCharsLost()
	 * @generated
	 */
	void setReceiveCharsLost(Long value);

	/**
	 * Returns the value of the '<em><b>Transmit IFrame Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of I-Frames transmitted for the last or current call. A continuous connection might exceed this value, given enough time. Typically these counters are implemented as 32- bit counters, but additional bits can be provided and are accounted for in this property. If these counters hit maximum value, the DCE manufacturer might roll over to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmit IFrame Count</em>' attribute.
	 * @see #setTransmitIFrameCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_TransmitIFrameCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTransmitIFrameCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getTransmitIFrameCount <em>Transmit IFrame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmit IFrame Count</em>' attribute.
	 * @see #getTransmitIFrameCount()
	 * @generated
	 */
	void setTransmitIFrameCount(Long value);

	/**
	 * Returns the value of the '<em><b>Receive IFrame Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of I-Frames received for the last or current call. A continuous connection might exceed this value, given enough time. Typically these counters are implemented as 32-bit counters, but additional bits can be provided and are accounted for in this property. If these counters hit maximum value, the DCE manufacturer might roll over to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive IFrame Count</em>' attribute.
	 * @see #setReceiveIFrameCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_ReceiveIFrameCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReceiveIFrameCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getReceiveIFrameCount <em>Receive IFrame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive IFrame Count</em>' attribute.
	 * @see #getReceiveIFrameCount()
	 * @generated
	 */
	void setReceiveIFrameCount(Long value);

	/**
	 * Returns the value of the '<em><b>Transmit IFrame Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of I-Frame errors detected for the last or current call, if error control protocol is running. A DCE might limit this counter to 16 bits, but additional bits can be provided and are accounted for in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmit IFrame Error Count</em>' attribute.
	 * @see #setTransmitIFrameErrorCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_TransmitIFrameErrorCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTransmitIFrameErrorCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getTransmitIFrameErrorCount <em>Transmit IFrame Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmit IFrame Error Count</em>' attribute.
	 * @see #getTransmitIFrameErrorCount()
	 * @generated
	 */
	void setTransmitIFrameErrorCount(Long value);

	/**
	 * Returns the value of the '<em><b>Received IFrame Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of I-Frame errors detected for the last or current call, if error control protocol is running. A DCE might limit this counter to 16 bits, but additional bits can be provided and are accounted for in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received IFrame Error Count</em>' attribute.
	 * @see #setReceivedIFrameErrorCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_ReceivedIFrameErrorCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReceivedIFrameErrorCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getReceivedIFrameErrorCount <em>Received IFrame Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received IFrame Error Count</em>' attribute.
	 * @see #getReceivedIFrameErrorCount()
	 * @generated
	 */
	void setReceivedIFrameErrorCount(Long value);

	/**
	 * Returns the value of the '<em><b>Call Waiting Event Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of Call waiting events detected for the last or current call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Call Waiting Event Count</em>' attribute.
	 * @see #setCallWaitingEventCount(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Unimodem_CallWaitingEventCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Counter='true'"
	 * @generated
	 */
	Integer getCallWaitingEventCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Unimodem#getCallWaitingEventCount <em>Call Waiting Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Waiting Event Count</em>' attribute.
	 * @see #getCallWaitingEventCount()
	 * @generated
	 */
	void setCallWaitingEventCount(Integer value);

} // CIM_Unimodem
