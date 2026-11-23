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

import org.dmtf.cim.CIM_DisplayController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Display Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DisplayControllerImpl#getVideoProcessor <em>Video Processor</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DisplayControllerImpl#getVideoMemoryType <em>Video Memory Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DisplayControllerImpl#getOtherVideoMemoryType <em>Other Video Memory Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DisplayControllerImpl#getNumberOfVideoPages <em>Number Of Video Pages</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DisplayControllerImpl#getMaxMemorySupported <em>Max Memory Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DisplayControllerImpl#getAcceleratorCapabilities <em>Accelerator Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DisplayControllerImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DisplayControllerImpl#getOtherVideoArchitecture <em>Other Video Architecture</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DisplayControllerImpl#getVideoArchitecture <em>Video Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DisplayControllerImpl extends CIM_ControllerImpl implements CIM_DisplayController {
	/**
	 * The default value of the '{@link #getVideoProcessor() <em>Video Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoProcessor()
	 * @generated
	 * @ordered
	 */
	protected static final String VIDEO_PROCESSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoProcessor() <em>Video Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoProcessor()
	 * @generated
	 * @ordered
	 */
	protected String videoProcessor = VIDEO_PROCESSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVideoMemoryType() <em>Video Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoMemoryType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VIDEO_MEMORY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoMemoryType() <em>Video Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoMemoryType()
	 * @generated
	 * @ordered
	 */
	protected Integer videoMemoryType = VIDEO_MEMORY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherVideoMemoryType() <em>Other Video Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherVideoMemoryType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_VIDEO_MEMORY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherVideoMemoryType() <em>Other Video Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherVideoMemoryType()
	 * @generated
	 * @ordered
	 */
	protected String otherVideoMemoryType = OTHER_VIDEO_MEMORY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfVideoPages() <em>Number Of Video Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfVideoPages()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_VIDEO_PAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfVideoPages() <em>Number Of Video Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfVideoPages()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfVideoPages = NUMBER_OF_VIDEO_PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxMemorySupported() <em>Max Memory Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMemorySupported()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_MEMORY_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxMemorySupported() <em>Max Memory Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMemorySupported()
	 * @generated
	 * @ordered
	 */
	protected Long maxMemorySupported = MAX_MEMORY_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcceleratorCapabilities() <em>Accelerator Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceleratorCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> acceleratorCapabilities;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilityDescriptions;

	/**
	 * The default value of the '{@link #getOtherVideoArchitecture() <em>Other Video Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherVideoArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_VIDEO_ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherVideoArchitecture() <em>Other Video Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherVideoArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String otherVideoArchitecture = OTHER_VIDEO_ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVideoArchitecture() <em>Video Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VIDEO_ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoArchitecture() <em>Video Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoArchitecture()
	 * @generated
	 * @ordered
	 */
	protected Integer videoArchitecture = VIDEO_ARCHITECTURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DisplayControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DisplayController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVideoProcessor() {
		return videoProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVideoProcessor(String newVideoProcessor) {
		String oldVideoProcessor = videoProcessor;
		videoProcessor = newVideoProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_PROCESSOR, oldVideoProcessor, videoProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVideoMemoryType() {
		return videoMemoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVideoMemoryType(Integer newVideoMemoryType) {
		Integer oldVideoMemoryType = videoMemoryType;
		videoMemoryType = newVideoMemoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_MEMORY_TYPE, oldVideoMemoryType, videoMemoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherVideoMemoryType() {
		return otherVideoMemoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherVideoMemoryType(String newOtherVideoMemoryType) {
		String oldOtherVideoMemoryType = otherVideoMemoryType;
		otherVideoMemoryType = newOtherVideoMemoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISPLAY_CONTROLLER__OTHER_VIDEO_MEMORY_TYPE, oldOtherVideoMemoryType, otherVideoMemoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfVideoPages() {
		return numberOfVideoPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfVideoPages(Long newNumberOfVideoPages) {
		Long oldNumberOfVideoPages = numberOfVideoPages;
		numberOfVideoPages = newNumberOfVideoPages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISPLAY_CONTROLLER__NUMBER_OF_VIDEO_PAGES, oldNumberOfVideoPages, numberOfVideoPages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxMemorySupported() {
		return maxMemorySupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxMemorySupported(Long newMaxMemorySupported) {
		Long oldMaxMemorySupported = maxMemorySupported;
		maxMemorySupported = newMaxMemorySupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISPLAY_CONTROLLER__MAX_MEMORY_SUPPORTED, oldMaxMemorySupported, maxMemorySupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAcceleratorCapabilities() {
		if (acceleratorCapabilities == null) {
			acceleratorCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DISPLAY_CONTROLLER__ACCELERATOR_CAPABILITIES);
		}
		return acceleratorCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapabilityDescriptions() {
		if (capabilityDescriptions == null) {
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DISPLAY_CONTROLLER__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherVideoArchitecture() {
		return otherVideoArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherVideoArchitecture(String newOtherVideoArchitecture) {
		String oldOtherVideoArchitecture = otherVideoArchitecture;
		otherVideoArchitecture = newOtherVideoArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISPLAY_CONTROLLER__OTHER_VIDEO_ARCHITECTURE, oldOtherVideoArchitecture, otherVideoArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVideoArchitecture() {
		return videoArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVideoArchitecture(Integer newVideoArchitecture) {
		Integer oldVideoArchitecture = videoArchitecture;
		videoArchitecture = newVideoArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_ARCHITECTURE, oldVideoArchitecture, videoArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_PROCESSOR:
				return getVideoProcessor();
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_MEMORY_TYPE:
				return getVideoMemoryType();
			case CimPackage.CIM_DISPLAY_CONTROLLER__OTHER_VIDEO_MEMORY_TYPE:
				return getOtherVideoMemoryType();
			case CimPackage.CIM_DISPLAY_CONTROLLER__NUMBER_OF_VIDEO_PAGES:
				return getNumberOfVideoPages();
			case CimPackage.CIM_DISPLAY_CONTROLLER__MAX_MEMORY_SUPPORTED:
				return getMaxMemorySupported();
			case CimPackage.CIM_DISPLAY_CONTROLLER__ACCELERATOR_CAPABILITIES:
				return getAcceleratorCapabilities();
			case CimPackage.CIM_DISPLAY_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_DISPLAY_CONTROLLER__OTHER_VIDEO_ARCHITECTURE:
				return getOtherVideoArchitecture();
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_ARCHITECTURE:
				return getVideoArchitecture();
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
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_PROCESSOR:
				setVideoProcessor((String)newValue);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_MEMORY_TYPE:
				setVideoMemoryType((Integer)newValue);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__OTHER_VIDEO_MEMORY_TYPE:
				setOtherVideoMemoryType((String)newValue);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__NUMBER_OF_VIDEO_PAGES:
				setNumberOfVideoPages((Long)newValue);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__MAX_MEMORY_SUPPORTED:
				setMaxMemorySupported((Long)newValue);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__ACCELERATOR_CAPABILITIES:
				getAcceleratorCapabilities().clear();
				getAcceleratorCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__OTHER_VIDEO_ARCHITECTURE:
				setOtherVideoArchitecture((String)newValue);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_ARCHITECTURE:
				setVideoArchitecture((Integer)newValue);
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
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_PROCESSOR:
				setVideoProcessor(VIDEO_PROCESSOR_EDEFAULT);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_MEMORY_TYPE:
				setVideoMemoryType(VIDEO_MEMORY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__OTHER_VIDEO_MEMORY_TYPE:
				setOtherVideoMemoryType(OTHER_VIDEO_MEMORY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__NUMBER_OF_VIDEO_PAGES:
				setNumberOfVideoPages(NUMBER_OF_VIDEO_PAGES_EDEFAULT);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__MAX_MEMORY_SUPPORTED:
				setMaxMemorySupported(MAX_MEMORY_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__ACCELERATOR_CAPABILITIES:
				getAcceleratorCapabilities().clear();
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__OTHER_VIDEO_ARCHITECTURE:
				setOtherVideoArchitecture(OTHER_VIDEO_ARCHITECTURE_EDEFAULT);
				return;
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_ARCHITECTURE:
				setVideoArchitecture(VIDEO_ARCHITECTURE_EDEFAULT);
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
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_PROCESSOR:
				return VIDEO_PROCESSOR_EDEFAULT == null ? videoProcessor != null : !VIDEO_PROCESSOR_EDEFAULT.equals(videoProcessor);
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_MEMORY_TYPE:
				return VIDEO_MEMORY_TYPE_EDEFAULT == null ? videoMemoryType != null : !VIDEO_MEMORY_TYPE_EDEFAULT.equals(videoMemoryType);
			case CimPackage.CIM_DISPLAY_CONTROLLER__OTHER_VIDEO_MEMORY_TYPE:
				return OTHER_VIDEO_MEMORY_TYPE_EDEFAULT == null ? otherVideoMemoryType != null : !OTHER_VIDEO_MEMORY_TYPE_EDEFAULT.equals(otherVideoMemoryType);
			case CimPackage.CIM_DISPLAY_CONTROLLER__NUMBER_OF_VIDEO_PAGES:
				return NUMBER_OF_VIDEO_PAGES_EDEFAULT == null ? numberOfVideoPages != null : !NUMBER_OF_VIDEO_PAGES_EDEFAULT.equals(numberOfVideoPages);
			case CimPackage.CIM_DISPLAY_CONTROLLER__MAX_MEMORY_SUPPORTED:
				return MAX_MEMORY_SUPPORTED_EDEFAULT == null ? maxMemorySupported != null : !MAX_MEMORY_SUPPORTED_EDEFAULT.equals(maxMemorySupported);
			case CimPackage.CIM_DISPLAY_CONTROLLER__ACCELERATOR_CAPABILITIES:
				return acceleratorCapabilities != null && !acceleratorCapabilities.isEmpty();
			case CimPackage.CIM_DISPLAY_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_DISPLAY_CONTROLLER__OTHER_VIDEO_ARCHITECTURE:
				return OTHER_VIDEO_ARCHITECTURE_EDEFAULT == null ? otherVideoArchitecture != null : !OTHER_VIDEO_ARCHITECTURE_EDEFAULT.equals(otherVideoArchitecture);
			case CimPackage.CIM_DISPLAY_CONTROLLER__VIDEO_ARCHITECTURE:
				return VIDEO_ARCHITECTURE_EDEFAULT == null ? videoArchitecture != null : !VIDEO_ARCHITECTURE_EDEFAULT.equals(videoArchitecture);
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
		result.append(" (VideoProcessor: ");
		result.append(videoProcessor);
		result.append(", VideoMemoryType: ");
		result.append(videoMemoryType);
		result.append(", OtherVideoMemoryType: ");
		result.append(otherVideoMemoryType);
		result.append(", NumberOfVideoPages: ");
		result.append(numberOfVideoPages);
		result.append(", MaxMemorySupported: ");
		result.append(maxMemorySupported);
		result.append(", AcceleratorCapabilities: ");
		result.append(acceleratorCapabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", OtherVideoArchitecture: ");
		result.append(otherVideoArchitecture);
		result.append(", VideoArchitecture: ");
		result.append(videoArchitecture);
		result.append(')');
		return result.toString();
	}

} //CIM_DisplayControllerImpl
