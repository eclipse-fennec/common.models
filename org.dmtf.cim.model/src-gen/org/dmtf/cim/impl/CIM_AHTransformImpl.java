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

import org.dmtf.cim.CIM_AHTransform;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM AH Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AHTransformImpl#getAHTransformId <em>AH Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AHTransformImpl#getOtherAHTransformId <em>Other AH Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AHTransformImpl#getUseReplayPrevention <em>Use Replay Prevention</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AHTransformImpl#getReplayPreventionWindowSize <em>Replay Prevention Window Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AHTransformImpl extends CIM_SATransformImpl implements CIM_AHTransform {
	/**
	 * The default value of the '{@link #getAHTransformId() <em>AH Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAHTransformId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AH_TRANSFORM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAHTransformId() <em>AH Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAHTransformId()
	 * @generated
	 * @ordered
	 */
	protected Integer ahTransformId = AH_TRANSFORM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAHTransformId() <em>Other AH Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAHTransformId()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_AH_TRANSFORM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAHTransformId() <em>Other AH Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAHTransformId()
	 * @generated
	 * @ordered
	 */
	protected String otherAHTransformId = OTHER_AH_TRANSFORM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseReplayPrevention() <em>Use Replay Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseReplayPrevention()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_REPLAY_PREVENTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseReplayPrevention() <em>Use Replay Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseReplayPrevention()
	 * @generated
	 * @ordered
	 */
	protected Boolean useReplayPrevention = USE_REPLAY_PREVENTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplayPreventionWindowSize() <em>Replay Prevention Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplayPreventionWindowSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long REPLAY_PREVENTION_WINDOW_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplayPreventionWindowSize() <em>Replay Prevention Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplayPreventionWindowSize()
	 * @generated
	 * @ordered
	 */
	protected Long replayPreventionWindowSize = REPLAY_PREVENTION_WINDOW_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AHTransformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AHTransform();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAHTransformId() {
		return ahTransformId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAHTransformId(Integer newAHTransformId) {
		Integer oldAHTransformId = ahTransformId;
		ahTransformId = newAHTransformId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AH_TRANSFORM__AH_TRANSFORM_ID, oldAHTransformId, ahTransformId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAHTransformId() {
		return otherAHTransformId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAHTransformId(String newOtherAHTransformId) {
		String oldOtherAHTransformId = otherAHTransformId;
		otherAHTransformId = newOtherAHTransformId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AH_TRANSFORM__OTHER_AH_TRANSFORM_ID, oldOtherAHTransformId, otherAHTransformId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUseReplayPrevention() {
		return useReplayPrevention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseReplayPrevention(Boolean newUseReplayPrevention) {
		Boolean oldUseReplayPrevention = useReplayPrevention;
		useReplayPrevention = newUseReplayPrevention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AH_TRANSFORM__USE_REPLAY_PREVENTION, oldUseReplayPrevention, useReplayPrevention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReplayPreventionWindowSize() {
		return replayPreventionWindowSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplayPreventionWindowSize(Long newReplayPreventionWindowSize) {
		Long oldReplayPreventionWindowSize = replayPreventionWindowSize;
		replayPreventionWindowSize = newReplayPreventionWindowSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AH_TRANSFORM__REPLAY_PREVENTION_WINDOW_SIZE, oldReplayPreventionWindowSize, replayPreventionWindowSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_AH_TRANSFORM__AH_TRANSFORM_ID:
				return getAHTransformId();
			case CimPackage.CIM_AH_TRANSFORM__OTHER_AH_TRANSFORM_ID:
				return getOtherAHTransformId();
			case CimPackage.CIM_AH_TRANSFORM__USE_REPLAY_PREVENTION:
				return getUseReplayPrevention();
			case CimPackage.CIM_AH_TRANSFORM__REPLAY_PREVENTION_WINDOW_SIZE:
				return getReplayPreventionWindowSize();
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
			case CimPackage.CIM_AH_TRANSFORM__AH_TRANSFORM_ID:
				setAHTransformId((Integer)newValue);
				return;
			case CimPackage.CIM_AH_TRANSFORM__OTHER_AH_TRANSFORM_ID:
				setOtherAHTransformId((String)newValue);
				return;
			case CimPackage.CIM_AH_TRANSFORM__USE_REPLAY_PREVENTION:
				setUseReplayPrevention((Boolean)newValue);
				return;
			case CimPackage.CIM_AH_TRANSFORM__REPLAY_PREVENTION_WINDOW_SIZE:
				setReplayPreventionWindowSize((Long)newValue);
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
			case CimPackage.CIM_AH_TRANSFORM__AH_TRANSFORM_ID:
				setAHTransformId(AH_TRANSFORM_ID_EDEFAULT);
				return;
			case CimPackage.CIM_AH_TRANSFORM__OTHER_AH_TRANSFORM_ID:
				setOtherAHTransformId(OTHER_AH_TRANSFORM_ID_EDEFAULT);
				return;
			case CimPackage.CIM_AH_TRANSFORM__USE_REPLAY_PREVENTION:
				setUseReplayPrevention(USE_REPLAY_PREVENTION_EDEFAULT);
				return;
			case CimPackage.CIM_AH_TRANSFORM__REPLAY_PREVENTION_WINDOW_SIZE:
				setReplayPreventionWindowSize(REPLAY_PREVENTION_WINDOW_SIZE_EDEFAULT);
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
			case CimPackage.CIM_AH_TRANSFORM__AH_TRANSFORM_ID:
				return AH_TRANSFORM_ID_EDEFAULT == null ? ahTransformId != null : !AH_TRANSFORM_ID_EDEFAULT.equals(ahTransformId);
			case CimPackage.CIM_AH_TRANSFORM__OTHER_AH_TRANSFORM_ID:
				return OTHER_AH_TRANSFORM_ID_EDEFAULT == null ? otherAHTransformId != null : !OTHER_AH_TRANSFORM_ID_EDEFAULT.equals(otherAHTransformId);
			case CimPackage.CIM_AH_TRANSFORM__USE_REPLAY_PREVENTION:
				return USE_REPLAY_PREVENTION_EDEFAULT == null ? useReplayPrevention != null : !USE_REPLAY_PREVENTION_EDEFAULT.equals(useReplayPrevention);
			case CimPackage.CIM_AH_TRANSFORM__REPLAY_PREVENTION_WINDOW_SIZE:
				return REPLAY_PREVENTION_WINDOW_SIZE_EDEFAULT == null ? replayPreventionWindowSize != null : !REPLAY_PREVENTION_WINDOW_SIZE_EDEFAULT.equals(replayPreventionWindowSize);
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
		result.append(" (AHTransformId: ");
		result.append(ahTransformId);
		result.append(", OtherAHTransformId: ");
		result.append(otherAHTransformId);
		result.append(", UseReplayPrevention: ");
		result.append(useReplayPrevention);
		result.append(", ReplayPreventionWindowSize: ");
		result.append(replayPreventionWindowSize);
		result.append(')');
		return result.toString();
	}

} //CIM_AHTransformImpl
