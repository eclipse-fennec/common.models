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
 * A representation of the model object '<em><b>CIM SCSI Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of this class is deprecated in lieu of ProtocolControllerForUnit, because the SCSIController class involved in this association is itself deprecated. The protocol-related aspects of SCSI are better reflected in the new classes and associations. 
 * Deprecated description: SCSIInterface is a ControlledBy relationship that indicates which Devices are accessed through a SCSIController and describes the characteristics of this access.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInterface#getSCSITimeouts <em>SCSI Timeouts</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInterface#getSCSIRetries <em>SCSI Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInterface#getInitiatorId <em>Initiator Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInterface#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInterface#getTargetLUN <em>Target LUN</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInterface#getSCSIReservation <em>SCSI Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInterface#getSCSISignal <em>SCSI Signal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInterface#getMaxQueueDepth <em>Max Queue Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIInterface#getQueueDepthLimit <em>Queue Depth Limit</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInterface()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ProtocolControllerAccessesUnit\"]' Version='2.10.0' UMLPackagePath='CIM::Device::Controller' override.Antecedent='CIM_SCSIController REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Description='Note: The use of this method is deprecated. \nDeprecated description: The SCSIController.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SCSIInterface extends CIM_ControlledBy {
	/**
	 * Returns the value of the '<em><b>SCSI Timeouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: Number of SCSI timeouts that have occurred since the last hard or soft reset that is related to the controlled Device. The time of last reset is indicated in the TimeOfDeviceReset property, inherited from the ControlledBy association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCSI Timeouts</em>' attribute.
	 * @see #setSCSITimeouts(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInterface_SCSITimeouts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getSCSITimeouts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInterface#getSCSITimeouts <em>SCSI Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCSI Timeouts</em>' attribute.
	 * @see #getSCSITimeouts()
	 * @generated
	 */
	void setSCSITimeouts(Long value);

	/**
	 * Returns the value of the '<em><b>SCSI Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: Number of SCSI retries that have occurred since the last hard or soft reset that is related to the controlled Device. The time of last reset is indicated in the TimeOfDeviceReset property, inherited from the ControlledBy association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCSI Retries</em>' attribute.
	 * @see #setSCSIRetries(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInterface_SCSIRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"No value\"]' Counter='true' MappingStrings='[\"MIF.DMTF|Mass Storage Statistics|001.18\"]'"
	 * @generated
	 */
	Long getSCSIRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInterface#getSCSIRetries <em>SCSI Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCSI Retries</em>' attribute.
	 * @see #getSCSIRetries()
	 * @generated
	 */
	void setSCSIRetries(Long value);

	/**
	 * Returns the value of the '<em><b>Initiator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: The SCSI Initiator ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initiator Id</em>' attribute.
	 * @see #setInitiatorId(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInterface_InitiatorId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"No value\"]' MappingStrings='[\"MIF.DMTF|Bus Port|004.5\"]'"
	 * @generated
	 */
	Long getInitiatorId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInterface#getInitiatorId <em>Initiator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator Id</em>' attribute.
	 * @see #getInitiatorId()
	 * @generated
	 */
	void setInitiatorId(Long value);

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: The SCSI Target ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Id</em>' attribute.
	 * @see #setTargetId(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInterface_TargetId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_ProtocolControllerAccessesUnit.TargetControllerNumber\"]' MappingStrings='[\"MIF.DMTF|Bus Port|004.5\"]'"
	 * @generated
	 */
	Long getTargetId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInterface#getTargetId <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' attribute.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(Long value);

	/**
	 * Returns the value of the '<em><b>Target LUN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: The SCSI Target LUN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target LUN</em>' attribute.
	 * @see #setTargetLUN(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInterface_TargetLUN()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_ProtocolControllerForDevice.DeviceNumber\"]' MappingStrings='[\"MIF.DMTF|Storage Devices|001.4\"]'"
	 * @generated
	 */
	Long getTargetLUN();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInterface#getTargetLUN <em>Target LUN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target LUN</em>' attribute.
	 * @see #getTargetLUN()
	 * @generated
	 */
	void setTargetLUN(Long value);

	/**
	 * Returns the value of the '<em><b>SCSI Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: SCSIReservation indicates the type of SCSI reservation that currently exists between the source and destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCSI Reservation</em>' attribute.
	 * @see #setSCSIReservation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInterface_SCSIReservation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"None\",\"Simple\",\"Persistent\"]'"
	 * @generated
	 */
	Integer getSCSIReservation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInterface#getSCSIReservation <em>SCSI Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCSI Reservation</em>' attribute.
	 * @see #getSCSIReservation()
	 * @generated
	 */
	void setSCSIReservation(Integer value);

	/**
	 * Returns the value of the '<em><b>SCSI Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: The SCSI signal characteristics being used for this connection. The value listed here must also be listed in the SignalCapabilities field of the SCSIController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SCSI Signal</em>' attribute.
	 * @see #setSCSISignal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInterface_SCSISignal()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Unknown\",\"Single Ended\",\"Differential\",\"Low Voltage Differential\",\"Optical\"]' MappingStrings='[\"MIF.DMTF|Bus Port|004.4\"]' ModelCorrespondence='[\"CIM_SCSIController.SignalCapabilities\"]'"
	 * @generated
	 */
	Integer getSCSISignal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInterface#getSCSISignal <em>SCSI Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCSI Signal</em>' attribute.
	 * @see #getSCSISignal()
	 * @generated
	 */
	void setSCSISignal(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Queue Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: Maximum number of Command Descriptor Blocks (CDBs) that can be supported by the target. This data cannot be obtained under all circumstances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Queue Depth</em>' attribute.
	 * @see #setMaxQueueDepth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInterface_MaxQueueDepth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Long getMaxQueueDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInterface#getMaxQueueDepth <em>Max Queue Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Queue Depth</em>' attribute.
	 * @see #getMaxQueueDepth()
	 * @generated
	 */
	void setMaxQueueDepth(Long value);

	/**
	 * Returns the value of the '<em><b>Queue Depth Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: The maximum number of concurrent Command Descriptor Blocks (CDBs) that the initiator will send to the target. This value should never be greater than MaxQueueDepth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Depth Limit</em>' attribute.
	 * @see #setQueueDepthLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIInterface_QueueDepthLimit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Long getQueueDepthLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIInterface#getQueueDepthLimit <em>Queue Depth Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Depth Limit</em>' attribute.
	 * @see #getQueueDepthLimit()
	 * @generated
	 */
	void setQueueDepthLimit(Long value);

} // CIM_SCSIInterface
