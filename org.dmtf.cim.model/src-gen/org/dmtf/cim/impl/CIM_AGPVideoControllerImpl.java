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

import java.util.Collection;

import org.dmtf.cim.CIM_AGPVideoController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM AGP Video Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPVideoControllerImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPVideoControllerImpl#getNonlocalVideoMemorySize <em>Nonlocal Video Memory Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPVideoControllerImpl#getLocalBusWidth <em>Local Bus Width</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPVideoControllerImpl#getUsageModel <em>Usage Model</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPVideoControllerImpl#getDataTransferRate <em>Data Transfer Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPVideoControllerImpl#getAddressingMode <em>Addressing Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPVideoControllerImpl#getMaximumAGPCommandQueuePath <em>Maximum AGP Command Queue Path</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPVideoControllerImpl#getMaxNumberOfPipelinedAGPTransactions <em>Max Number Of Pipelined AGP Transactions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPVideoControllerImpl#getGraphicsApertureSize <em>Graphics Aperture Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AGPVideoControllerImpl#getAGPSpecificationVersionConformance <em>AGP Specification Version Conformance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AGPVideoControllerImpl extends CIM_VideoControllerImpl implements CIM_AGPVideoController {
	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * The default value of the '{@link #getNonlocalVideoMemorySize() <em>Nonlocal Video Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonlocalVideoMemorySize()
	 * @generated
	 * @ordered
	 */
	protected static final Long NONLOCAL_VIDEO_MEMORY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonlocalVideoMemorySize() <em>Nonlocal Video Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonlocalVideoMemorySize()
	 * @generated
	 * @ordered
	 */
	protected Long nonlocalVideoMemorySize = NONLOCAL_VIDEO_MEMORY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalBusWidth() <em>Local Bus Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalBusWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOCAL_BUS_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalBusWidth() <em>Local Bus Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalBusWidth()
	 * @generated
	 * @ordered
	 */
	protected Long localBusWidth = LOCAL_BUS_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsageModel() <em>Usage Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageModel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USAGE_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageModel() <em>Usage Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageModel()
	 * @generated
	 * @ordered
	 */
	protected Integer usageModel = USAGE_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataTransferRate() <em>Data Transfer Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTransferRate()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_TRANSFER_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataTransferRate() <em>Data Transfer Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTransferRate()
	 * @generated
	 * @ordered
	 */
	protected Integer dataTransferRate = DATA_TRANSFER_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressingMode() <em>Addressing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressingMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESSING_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressingMode() <em>Addressing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressingMode()
	 * @generated
	 * @ordered
	 */
	protected Integer addressingMode = ADDRESSING_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumAGPCommandQueuePath() <em>Maximum AGP Command Queue Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAGPCommandQueuePath()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAXIMUM_AGP_COMMAND_QUEUE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumAGPCommandQueuePath() <em>Maximum AGP Command Queue Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAGPCommandQueuePath()
	 * @generated
	 * @ordered
	 */
	protected Long maximumAGPCommandQueuePath = MAXIMUM_AGP_COMMAND_QUEUE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumberOfPipelinedAGPTransactions() <em>Max Number Of Pipelined AGP Transactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfPipelinedAGPTransactions()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUMBER_OF_PIPELINED_AGP_TRANSACTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberOfPipelinedAGPTransactions() <em>Max Number Of Pipelined AGP Transactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfPipelinedAGPTransactions()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumberOfPipelinedAGPTransactions = MAX_NUMBER_OF_PIPELINED_AGP_TRANSACTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGraphicsApertureSize() <em>Graphics Aperture Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicsApertureSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long GRAPHICS_APERTURE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraphicsApertureSize() <em>Graphics Aperture Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicsApertureSize()
	 * @generated
	 * @ordered
	 */
	protected Long graphicsApertureSize = GRAPHICS_APERTURE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAGPSpecificationVersionConformance() <em>AGP Specification Version Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGPSpecificationVersionConformance()
	 * @generated
	 * @ordered
	 */
	protected static final String AGP_SPECIFICATION_VERSION_CONFORMANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAGPSpecificationVersionConformance() <em>AGP Specification Version Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGPSpecificationVersionConformance()
	 * @generated
	 * @ordered
	 */
	protected String agpSpecificationVersionConformance = AGP_SPECIFICATION_VERSION_CONFORMANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AGPVideoControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AGPVideoController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_AGP_VIDEO_CONTROLLER__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNonlocalVideoMemorySize() {
		return nonlocalVideoMemorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNonlocalVideoMemorySize(Long newNonlocalVideoMemorySize) {
		Long oldNonlocalVideoMemorySize = nonlocalVideoMemorySize;
		nonlocalVideoMemorySize = newNonlocalVideoMemorySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGP_VIDEO_CONTROLLER__NONLOCAL_VIDEO_MEMORY_SIZE, oldNonlocalVideoMemorySize, nonlocalVideoMemorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLocalBusWidth() {
		return localBusWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalBusWidth(Long newLocalBusWidth) {
		Long oldLocalBusWidth = localBusWidth;
		localBusWidth = newLocalBusWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGP_VIDEO_CONTROLLER__LOCAL_BUS_WIDTH, oldLocalBusWidth, localBusWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUsageModel() {
		return usageModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageModel(Integer newUsageModel) {
		Integer oldUsageModel = usageModel;
		usageModel = newUsageModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGP_VIDEO_CONTROLLER__USAGE_MODEL, oldUsageModel, usageModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataTransferRate() {
		return dataTransferRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataTransferRate(Integer newDataTransferRate) {
		Integer oldDataTransferRate = dataTransferRate;
		dataTransferRate = newDataTransferRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGP_VIDEO_CONTROLLER__DATA_TRANSFER_RATE, oldDataTransferRate, dataTransferRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressingMode() {
		return addressingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressingMode(Integer newAddressingMode) {
		Integer oldAddressingMode = addressingMode;
		addressingMode = newAddressingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGP_VIDEO_CONTROLLER__ADDRESSING_MODE, oldAddressingMode, addressingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaximumAGPCommandQueuePath() {
		return maximumAGPCommandQueuePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumAGPCommandQueuePath(Long newMaximumAGPCommandQueuePath) {
		Long oldMaximumAGPCommandQueuePath = maximumAGPCommandQueuePath;
		maximumAGPCommandQueuePath = newMaximumAGPCommandQueuePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGP_VIDEO_CONTROLLER__MAXIMUM_AGP_COMMAND_QUEUE_PATH, oldMaximumAGPCommandQueuePath, maximumAGPCommandQueuePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumberOfPipelinedAGPTransactions() {
		return maxNumberOfPipelinedAGPTransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumberOfPipelinedAGPTransactions(Long newMaxNumberOfPipelinedAGPTransactions) {
		Long oldMaxNumberOfPipelinedAGPTransactions = maxNumberOfPipelinedAGPTransactions;
		maxNumberOfPipelinedAGPTransactions = newMaxNumberOfPipelinedAGPTransactions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGP_VIDEO_CONTROLLER__MAX_NUMBER_OF_PIPELINED_AGP_TRANSACTIONS, oldMaxNumberOfPipelinedAGPTransactions, maxNumberOfPipelinedAGPTransactions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getGraphicsApertureSize() {
		return graphicsApertureSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraphicsApertureSize(Long newGraphicsApertureSize) {
		Long oldGraphicsApertureSize = graphicsApertureSize;
		graphicsApertureSize = newGraphicsApertureSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGP_VIDEO_CONTROLLER__GRAPHICS_APERTURE_SIZE, oldGraphicsApertureSize, graphicsApertureSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAGPSpecificationVersionConformance() {
		return agpSpecificationVersionConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAGPSpecificationVersionConformance(String newAGPSpecificationVersionConformance) {
		String oldAGPSpecificationVersionConformance = agpSpecificationVersionConformance;
		agpSpecificationVersionConformance = newAGPSpecificationVersionConformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AGP_VIDEO_CONTROLLER__AGP_SPECIFICATION_VERSION_CONFORMANCE, oldAGPSpecificationVersionConformance, agpSpecificationVersionConformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__NONLOCAL_VIDEO_MEMORY_SIZE:
				return getNonlocalVideoMemorySize();
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__LOCAL_BUS_WIDTH:
				return getLocalBusWidth();
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__USAGE_MODEL:
				return getUsageModel();
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__DATA_TRANSFER_RATE:
				return getDataTransferRate();
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__ADDRESSING_MODE:
				return getAddressingMode();
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__MAXIMUM_AGP_COMMAND_QUEUE_PATH:
				return getMaximumAGPCommandQueuePath();
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__MAX_NUMBER_OF_PIPELINED_AGP_TRANSACTIONS:
				return getMaxNumberOfPipelinedAGPTransactions();
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__GRAPHICS_APERTURE_SIZE:
				return getGraphicsApertureSize();
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__AGP_SPECIFICATION_VERSION_CONFORMANCE:
				return getAGPSpecificationVersionConformance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__NONLOCAL_VIDEO_MEMORY_SIZE:
				setNonlocalVideoMemorySize((Long)newValue);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__LOCAL_BUS_WIDTH:
				setLocalBusWidth((Long)newValue);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__USAGE_MODEL:
				setUsageModel((Integer)newValue);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__DATA_TRANSFER_RATE:
				setDataTransferRate((Integer)newValue);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__ADDRESSING_MODE:
				setAddressingMode((Integer)newValue);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__MAXIMUM_AGP_COMMAND_QUEUE_PATH:
				setMaximumAGPCommandQueuePath((Long)newValue);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__MAX_NUMBER_OF_PIPELINED_AGP_TRANSACTIONS:
				setMaxNumberOfPipelinedAGPTransactions((Long)newValue);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__GRAPHICS_APERTURE_SIZE:
				setGraphicsApertureSize((Long)newValue);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__AGP_SPECIFICATION_VERSION_CONFORMANCE:
				setAGPSpecificationVersionConformance((String)newValue);
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
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__NONLOCAL_VIDEO_MEMORY_SIZE:
				setNonlocalVideoMemorySize(NONLOCAL_VIDEO_MEMORY_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__LOCAL_BUS_WIDTH:
				setLocalBusWidth(LOCAL_BUS_WIDTH_EDEFAULT);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__USAGE_MODEL:
				setUsageModel(USAGE_MODEL_EDEFAULT);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__DATA_TRANSFER_RATE:
				setDataTransferRate(DATA_TRANSFER_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__ADDRESSING_MODE:
				setAddressingMode(ADDRESSING_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__MAXIMUM_AGP_COMMAND_QUEUE_PATH:
				setMaximumAGPCommandQueuePath(MAXIMUM_AGP_COMMAND_QUEUE_PATH_EDEFAULT);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__MAX_NUMBER_OF_PIPELINED_AGP_TRANSACTIONS:
				setMaxNumberOfPipelinedAGPTransactions(MAX_NUMBER_OF_PIPELINED_AGP_TRANSACTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__GRAPHICS_APERTURE_SIZE:
				setGraphicsApertureSize(GRAPHICS_APERTURE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__AGP_SPECIFICATION_VERSION_CONFORMANCE:
				setAGPSpecificationVersionConformance(AGP_SPECIFICATION_VERSION_CONFORMANCE_EDEFAULT);
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
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__NONLOCAL_VIDEO_MEMORY_SIZE:
				return NONLOCAL_VIDEO_MEMORY_SIZE_EDEFAULT == null ? nonlocalVideoMemorySize != null : !NONLOCAL_VIDEO_MEMORY_SIZE_EDEFAULT.equals(nonlocalVideoMemorySize);
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__LOCAL_BUS_WIDTH:
				return LOCAL_BUS_WIDTH_EDEFAULT == null ? localBusWidth != null : !LOCAL_BUS_WIDTH_EDEFAULT.equals(localBusWidth);
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__USAGE_MODEL:
				return USAGE_MODEL_EDEFAULT == null ? usageModel != null : !USAGE_MODEL_EDEFAULT.equals(usageModel);
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__DATA_TRANSFER_RATE:
				return DATA_TRANSFER_RATE_EDEFAULT == null ? dataTransferRate != null : !DATA_TRANSFER_RATE_EDEFAULT.equals(dataTransferRate);
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__ADDRESSING_MODE:
				return ADDRESSING_MODE_EDEFAULT == null ? addressingMode != null : !ADDRESSING_MODE_EDEFAULT.equals(addressingMode);
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__MAXIMUM_AGP_COMMAND_QUEUE_PATH:
				return MAXIMUM_AGP_COMMAND_QUEUE_PATH_EDEFAULT == null ? maximumAGPCommandQueuePath != null : !MAXIMUM_AGP_COMMAND_QUEUE_PATH_EDEFAULT.equals(maximumAGPCommandQueuePath);
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__MAX_NUMBER_OF_PIPELINED_AGP_TRANSACTIONS:
				return MAX_NUMBER_OF_PIPELINED_AGP_TRANSACTIONS_EDEFAULT == null ? maxNumberOfPipelinedAGPTransactions != null : !MAX_NUMBER_OF_PIPELINED_AGP_TRANSACTIONS_EDEFAULT.equals(maxNumberOfPipelinedAGPTransactions);
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__GRAPHICS_APERTURE_SIZE:
				return GRAPHICS_APERTURE_SIZE_EDEFAULT == null ? graphicsApertureSize != null : !GRAPHICS_APERTURE_SIZE_EDEFAULT.equals(graphicsApertureSize);
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER__AGP_SPECIFICATION_VERSION_CONFORMANCE:
				return AGP_SPECIFICATION_VERSION_CONFORMANCE_EDEFAULT == null ? agpSpecificationVersionConformance != null : !AGP_SPECIFICATION_VERSION_CONFORMANCE_EDEFAULT.equals(agpSpecificationVersionConformance);
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
		result.append(" (Capabilities: ");
		result.append(capabilities);
		result.append(", NonlocalVideoMemorySize: ");
		result.append(nonlocalVideoMemorySize);
		result.append(", LocalBusWidth: ");
		result.append(localBusWidth);
		result.append(", UsageModel: ");
		result.append(usageModel);
		result.append(", DataTransferRate: ");
		result.append(dataTransferRate);
		result.append(", AddressingMode: ");
		result.append(addressingMode);
		result.append(", MaximumAGPCommandQueuePath: ");
		result.append(maximumAGPCommandQueuePath);
		result.append(", MaxNumberOfPipelinedAGPTransactions: ");
		result.append(maxNumberOfPipelinedAGPTransactions);
		result.append(", GraphicsApertureSize: ");
		result.append(graphicsApertureSize);
		result.append(", AGPSpecificationVersionConformance: ");
		result.append(agpSpecificationVersionConformance);
		result.append(')');
		return result.toString();
	}

} //CIM_AGPVideoControllerImpl
