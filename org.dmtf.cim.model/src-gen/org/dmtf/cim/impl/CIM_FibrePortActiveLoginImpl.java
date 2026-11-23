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

import org.dmtf.cim.CIM_FibrePort;
import org.dmtf.cim.CIM_FibrePortActiveLogin;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Fibre Port Active Login</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortActiveLoginImpl#getLoginOriginator <em>Login Originator</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortActiveLoginImpl#getLoginResponder <em>Login Responder</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortActiveLoginImpl#getNegotiatedCOS <em>Negotiated COS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortActiveLoginImpl#getNegotiatedFrameSize <em>Negotiated Frame Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortActiveLoginImpl#getNegotiatedSpeed <em>Negotiated Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortActiveLoginImpl#getACKModel <em>ACK Model</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortActiveLoginImpl#getBufferToBufferModel <em>Buffer To Buffer Model</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortActiveLoginImpl#getOriginatorBufferCredit <em>Originator Buffer Credit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortActiveLoginImpl#getResponderBufferCredit <em>Responder Buffer Credit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortActiveLoginImpl#getOriginatorEndCredit <em>Originator End Credit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortActiveLoginImpl#getResponderEndCredit <em>Responder End Credit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FibrePortActiveLoginImpl extends MinimalEObjectImpl.Container implements CIM_FibrePortActiveLogin {
	/**
	 * The cached value of the '{@link #getLoginOriginator() <em>Login Originator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginOriginator()
	 * @generated
	 * @ordered
	 */
	protected CIM_FibrePort loginOriginator;

	/**
	 * The cached value of the '{@link #getLoginResponder() <em>Login Responder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginResponder()
	 * @generated
	 * @ordered
	 */
	protected CIM_FibrePort loginResponder;

	/**
	 * The default value of the '{@link #getNegotiatedCOS() <em>Negotiated COS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedCOS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NEGOTIATED_COS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegotiatedCOS() <em>Negotiated COS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedCOS()
	 * @generated
	 * @ordered
	 */
	protected Integer negotiatedCOS = NEGOTIATED_COS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegotiatedFrameSize() <em>Negotiated Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedFrameSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long NEGOTIATED_FRAME_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegotiatedFrameSize() <em>Negotiated Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedFrameSize()
	 * @generated
	 * @ordered
	 */
	protected Long negotiatedFrameSize = NEGOTIATED_FRAME_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegotiatedSpeed() <em>Negotiated Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long NEGOTIATED_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegotiatedSpeed() <em>Negotiated Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long negotiatedSpeed = NEGOTIATED_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getACKModel() <em>ACK Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACKModel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACK_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getACKModel() <em>ACK Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACKModel()
	 * @generated
	 * @ordered
	 */
	protected Integer ackModel = ACK_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferToBufferModel() <em>Buffer To Buffer Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferToBufferModel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BUFFER_TO_BUFFER_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferToBufferModel() <em>Buffer To Buffer Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferToBufferModel()
	 * @generated
	 * @ordered
	 */
	protected Integer bufferToBufferModel = BUFFER_TO_BUFFER_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginatorBufferCredit() <em>Originator Buffer Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorBufferCredit()
	 * @generated
	 * @ordered
	 */
	protected static final Long ORIGINATOR_BUFFER_CREDIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginatorBufferCredit() <em>Originator Buffer Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorBufferCredit()
	 * @generated
	 * @ordered
	 */
	protected Long originatorBufferCredit = ORIGINATOR_BUFFER_CREDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponderBufferCredit() <em>Responder Buffer Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponderBufferCredit()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESPONDER_BUFFER_CREDIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponderBufferCredit() <em>Responder Buffer Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponderBufferCredit()
	 * @generated
	 * @ordered
	 */
	protected Long responderBufferCredit = RESPONDER_BUFFER_CREDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginatorEndCredit() <em>Originator End Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorEndCredit()
	 * @generated
	 * @ordered
	 */
	protected static final Long ORIGINATOR_END_CREDIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginatorEndCredit() <em>Originator End Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorEndCredit()
	 * @generated
	 * @ordered
	 */
	protected Long originatorEndCredit = ORIGINATOR_END_CREDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponderEndCredit() <em>Responder End Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponderEndCredit()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESPONDER_END_CREDIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponderEndCredit() <em>Responder End Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponderEndCredit()
	 * @generated
	 * @ordered
	 */
	protected Long responderEndCredit = RESPONDER_END_CREDIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FibrePortActiveLoginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FibrePortActiveLogin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FibrePort getLoginOriginator() {
		if (loginOriginator != null && loginOriginator.eIsProxy()) {
			InternalEObject oldLoginOriginator = (InternalEObject)loginOriginator;
			loginOriginator = (CIM_FibrePort)eResolveProxy(oldLoginOriginator);
			if (loginOriginator != oldLoginOriginator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_ORIGINATOR, oldLoginOriginator, loginOriginator));
			}
		}
		return loginOriginator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_FibrePort basicGetLoginOriginator() {
		return loginOriginator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginOriginator(CIM_FibrePort newLoginOriginator) {
		CIM_FibrePort oldLoginOriginator = loginOriginator;
		loginOriginator = newLoginOriginator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_ORIGINATOR, oldLoginOriginator, loginOriginator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FibrePort getLoginResponder() {
		if (loginResponder != null && loginResponder.eIsProxy()) {
			InternalEObject oldLoginResponder = (InternalEObject)loginResponder;
			loginResponder = (CIM_FibrePort)eResolveProxy(oldLoginResponder);
			if (loginResponder != oldLoginResponder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_RESPONDER, oldLoginResponder, loginResponder));
			}
		}
		return loginResponder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_FibrePort basicGetLoginResponder() {
		return loginResponder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginResponder(CIM_FibrePort newLoginResponder) {
		CIM_FibrePort oldLoginResponder = loginResponder;
		loginResponder = newLoginResponder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_RESPONDER, oldLoginResponder, loginResponder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNegotiatedCOS() {
		return negotiatedCOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegotiatedCOS(Integer newNegotiatedCOS) {
		Integer oldNegotiatedCOS = negotiatedCOS;
		negotiatedCOS = newNegotiatedCOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_COS, oldNegotiatedCOS, negotiatedCOS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNegotiatedFrameSize() {
		return negotiatedFrameSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegotiatedFrameSize(Long newNegotiatedFrameSize) {
		Long oldNegotiatedFrameSize = negotiatedFrameSize;
		negotiatedFrameSize = newNegotiatedFrameSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_FRAME_SIZE, oldNegotiatedFrameSize, negotiatedFrameSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNegotiatedSpeed() {
		return negotiatedSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegotiatedSpeed(Long newNegotiatedSpeed) {
		Long oldNegotiatedSpeed = negotiatedSpeed;
		negotiatedSpeed = newNegotiatedSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_SPEED, oldNegotiatedSpeed, negotiatedSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getACKModel() {
		return ackModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setACKModel(Integer newACKModel) {
		Integer oldACKModel = ackModel;
		ackModel = newACKModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ACK_MODEL, oldACKModel, ackModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBufferToBufferModel() {
		return bufferToBufferModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBufferToBufferModel(Integer newBufferToBufferModel) {
		Integer oldBufferToBufferModel = bufferToBufferModel;
		bufferToBufferModel = newBufferToBufferModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__BUFFER_TO_BUFFER_MODEL, oldBufferToBufferModel, bufferToBufferModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOriginatorBufferCredit() {
		return originatorBufferCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatorBufferCredit(Long newOriginatorBufferCredit) {
		Long oldOriginatorBufferCredit = originatorBufferCredit;
		originatorBufferCredit = newOriginatorBufferCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ORIGINATOR_BUFFER_CREDIT, oldOriginatorBufferCredit, originatorBufferCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getResponderBufferCredit() {
		return responderBufferCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponderBufferCredit(Long newResponderBufferCredit) {
		Long oldResponderBufferCredit = responderBufferCredit;
		responderBufferCredit = newResponderBufferCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__RESPONDER_BUFFER_CREDIT, oldResponderBufferCredit, responderBufferCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOriginatorEndCredit() {
		return originatorEndCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatorEndCredit(Long newOriginatorEndCredit) {
		Long oldOriginatorEndCredit = originatorEndCredit;
		originatorEndCredit = newOriginatorEndCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ORIGINATOR_END_CREDIT, oldOriginatorEndCredit, originatorEndCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getResponderEndCredit() {
		return responderEndCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponderEndCredit(Long newResponderEndCredit) {
		Long oldResponderEndCredit = responderEndCredit;
		responderEndCredit = newResponderEndCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__RESPONDER_END_CREDIT, oldResponderEndCredit, responderEndCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_ORIGINATOR:
				if (resolve) return getLoginOriginator();
				return basicGetLoginOriginator();
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_RESPONDER:
				if (resolve) return getLoginResponder();
				return basicGetLoginResponder();
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_COS:
				return getNegotiatedCOS();
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_FRAME_SIZE:
				return getNegotiatedFrameSize();
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_SPEED:
				return getNegotiatedSpeed();
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ACK_MODEL:
				return getACKModel();
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__BUFFER_TO_BUFFER_MODEL:
				return getBufferToBufferModel();
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ORIGINATOR_BUFFER_CREDIT:
				return getOriginatorBufferCredit();
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__RESPONDER_BUFFER_CREDIT:
				return getResponderBufferCredit();
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ORIGINATOR_END_CREDIT:
				return getOriginatorEndCredit();
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__RESPONDER_END_CREDIT:
				return getResponderEndCredit();
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
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_ORIGINATOR:
				setLoginOriginator((CIM_FibrePort)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_RESPONDER:
				setLoginResponder((CIM_FibrePort)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_COS:
				setNegotiatedCOS((Integer)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_FRAME_SIZE:
				setNegotiatedFrameSize((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_SPEED:
				setNegotiatedSpeed((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ACK_MODEL:
				setACKModel((Integer)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__BUFFER_TO_BUFFER_MODEL:
				setBufferToBufferModel((Integer)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ORIGINATOR_BUFFER_CREDIT:
				setOriginatorBufferCredit((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__RESPONDER_BUFFER_CREDIT:
				setResponderBufferCredit((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ORIGINATOR_END_CREDIT:
				setOriginatorEndCredit((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__RESPONDER_END_CREDIT:
				setResponderEndCredit((Long)newValue);
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
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_ORIGINATOR:
				setLoginOriginator((CIM_FibrePort)null);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_RESPONDER:
				setLoginResponder((CIM_FibrePort)null);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_COS:
				setNegotiatedCOS(NEGOTIATED_COS_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_FRAME_SIZE:
				setNegotiatedFrameSize(NEGOTIATED_FRAME_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_SPEED:
				setNegotiatedSpeed(NEGOTIATED_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ACK_MODEL:
				setACKModel(ACK_MODEL_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__BUFFER_TO_BUFFER_MODEL:
				setBufferToBufferModel(BUFFER_TO_BUFFER_MODEL_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ORIGINATOR_BUFFER_CREDIT:
				setOriginatorBufferCredit(ORIGINATOR_BUFFER_CREDIT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__RESPONDER_BUFFER_CREDIT:
				setResponderBufferCredit(RESPONDER_BUFFER_CREDIT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ORIGINATOR_END_CREDIT:
				setOriginatorEndCredit(ORIGINATOR_END_CREDIT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__RESPONDER_END_CREDIT:
				setResponderEndCredit(RESPONDER_END_CREDIT_EDEFAULT);
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
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_ORIGINATOR:
				return loginOriginator != null;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__LOGIN_RESPONDER:
				return loginResponder != null;
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_COS:
				return NEGOTIATED_COS_EDEFAULT == null ? negotiatedCOS != null : !NEGOTIATED_COS_EDEFAULT.equals(negotiatedCOS);
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_FRAME_SIZE:
				return NEGOTIATED_FRAME_SIZE_EDEFAULT == null ? negotiatedFrameSize != null : !NEGOTIATED_FRAME_SIZE_EDEFAULT.equals(negotiatedFrameSize);
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__NEGOTIATED_SPEED:
				return NEGOTIATED_SPEED_EDEFAULT == null ? negotiatedSpeed != null : !NEGOTIATED_SPEED_EDEFAULT.equals(negotiatedSpeed);
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ACK_MODEL:
				return ACK_MODEL_EDEFAULT == null ? ackModel != null : !ACK_MODEL_EDEFAULT.equals(ackModel);
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__BUFFER_TO_BUFFER_MODEL:
				return BUFFER_TO_BUFFER_MODEL_EDEFAULT == null ? bufferToBufferModel != null : !BUFFER_TO_BUFFER_MODEL_EDEFAULT.equals(bufferToBufferModel);
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ORIGINATOR_BUFFER_CREDIT:
				return ORIGINATOR_BUFFER_CREDIT_EDEFAULT == null ? originatorBufferCredit != null : !ORIGINATOR_BUFFER_CREDIT_EDEFAULT.equals(originatorBufferCredit);
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__RESPONDER_BUFFER_CREDIT:
				return RESPONDER_BUFFER_CREDIT_EDEFAULT == null ? responderBufferCredit != null : !RESPONDER_BUFFER_CREDIT_EDEFAULT.equals(responderBufferCredit);
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__ORIGINATOR_END_CREDIT:
				return ORIGINATOR_END_CREDIT_EDEFAULT == null ? originatorEndCredit != null : !ORIGINATOR_END_CREDIT_EDEFAULT.equals(originatorEndCredit);
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN__RESPONDER_END_CREDIT:
				return RESPONDER_END_CREDIT_EDEFAULT == null ? responderEndCredit != null : !RESPONDER_END_CREDIT_EDEFAULT.equals(responderEndCredit);
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
		result.append(" (NegotiatedCOS: ");
		result.append(negotiatedCOS);
		result.append(", NegotiatedFrameSize: ");
		result.append(negotiatedFrameSize);
		result.append(", NegotiatedSpeed: ");
		result.append(negotiatedSpeed);
		result.append(", ACKModel: ");
		result.append(ackModel);
		result.append(", BufferToBufferModel: ");
		result.append(bufferToBufferModel);
		result.append(", OriginatorBufferCredit: ");
		result.append(originatorBufferCredit);
		result.append(", ResponderBufferCredit: ");
		result.append(responderBufferCredit);
		result.append(", OriginatorEndCredit: ");
		result.append(originatorEndCredit);
		result.append(", ResponderEndCredit: ");
		result.append(responderEndCredit);
		result.append(')');
		return result.toString();
	}

} //CIM_FibrePortActiveLoginImpl
