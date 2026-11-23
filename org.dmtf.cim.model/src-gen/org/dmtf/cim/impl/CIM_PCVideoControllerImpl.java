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

import org.dmtf.cim.CIM_PCVideoController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM PC Video Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCVideoControllerImpl#getVideoArchitecture <em>Video Architecture</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCVideoControllerImpl#getVideoMode <em>Video Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCVideoControllerImpl#getNumberOfColorPlanes <em>Number Of Color Planes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PCVideoControllerImpl extends CIM_VideoControllerImpl implements CIM_PCVideoController {
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
	 * The default value of the '{@link #getVideoMode() <em>Video Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VIDEO_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoMode() <em>Video Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoMode()
	 * @generated
	 * @ordered
	 */
	protected Integer videoMode = VIDEO_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfColorPlanes() <em>Number Of Color Planes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfColorPlanes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_COLOR_PLANES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfColorPlanes() <em>Number Of Color Planes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfColorPlanes()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfColorPlanes = NUMBER_OF_COLOR_PLANES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PCVideoControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PCVideoController();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PC_VIDEO_CONTROLLER__VIDEO_ARCHITECTURE, oldVideoArchitecture, videoArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVideoMode() {
		return videoMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVideoMode(Integer newVideoMode) {
		Integer oldVideoMode = videoMode;
		videoMode = newVideoMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PC_VIDEO_CONTROLLER__VIDEO_MODE, oldVideoMode, videoMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfColorPlanes() {
		return numberOfColorPlanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfColorPlanes(Integer newNumberOfColorPlanes) {
		Integer oldNumberOfColorPlanes = numberOfColorPlanes;
		numberOfColorPlanes = newNumberOfColorPlanes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PC_VIDEO_CONTROLLER__NUMBER_OF_COLOR_PLANES, oldNumberOfColorPlanes, numberOfColorPlanes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__VIDEO_ARCHITECTURE:
				return getVideoArchitecture();
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__VIDEO_MODE:
				return getVideoMode();
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__NUMBER_OF_COLOR_PLANES:
				return getNumberOfColorPlanes();
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
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__VIDEO_ARCHITECTURE:
				setVideoArchitecture((Integer)newValue);
				return;
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__VIDEO_MODE:
				setVideoMode((Integer)newValue);
				return;
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__NUMBER_OF_COLOR_PLANES:
				setNumberOfColorPlanes((Integer)newValue);
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
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__VIDEO_ARCHITECTURE:
				setVideoArchitecture(VIDEO_ARCHITECTURE_EDEFAULT);
				return;
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__VIDEO_MODE:
				setVideoMode(VIDEO_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__NUMBER_OF_COLOR_PLANES:
				setNumberOfColorPlanes(NUMBER_OF_COLOR_PLANES_EDEFAULT);
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
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__VIDEO_ARCHITECTURE:
				return VIDEO_ARCHITECTURE_EDEFAULT == null ? videoArchitecture != null : !VIDEO_ARCHITECTURE_EDEFAULT.equals(videoArchitecture);
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__VIDEO_MODE:
				return VIDEO_MODE_EDEFAULT == null ? videoMode != null : !VIDEO_MODE_EDEFAULT.equals(videoMode);
			case CimPackage.CIM_PC_VIDEO_CONTROLLER__NUMBER_OF_COLOR_PLANES:
				return NUMBER_OF_COLOR_PLANES_EDEFAULT == null ? numberOfColorPlanes != null : !NUMBER_OF_COLOR_PLANES_EDEFAULT.equals(numberOfColorPlanes);
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
		result.append(" (VideoArchitecture: ");
		result.append(videoArchitecture);
		result.append(", VideoMode: ");
		result.append(videoMode);
		result.append(", NumberOfColorPlanes: ");
		result.append(numberOfColorPlanes);
		result.append(')');
		return result.toString();
	}

} //CIM_PCVideoControllerImpl
